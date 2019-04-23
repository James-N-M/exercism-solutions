import java.util.*; 
import java.math.BigInteger; 

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        BigInteger A;
        BigInteger B;

        while(keyboard.hasNext())
        {
            A = new BigInteger(keyboard.next());
            B = new BigInteger(keyboard.next()); 
            A = A.subtract(B);
            
            A = A.abs();
            System.out.println(A);
        }
    }
}