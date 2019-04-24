import java.math.BigInteger;
import java.util.*; 

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner keyboard = new Scanner(System.in); 
        
        String inputA = keyboard.nextLine();
        String inputB = keyboard.nextLine();
        
        BigInteger A = new BigInteger(inputA);
        BigInteger B = new BigInteger(inputB);

        System.out.println(A.add(B));
    }

}