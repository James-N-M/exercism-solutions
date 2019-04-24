import java.util.*;
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        int N;
        N = input.nextInt(); 
        if((N % 2) == 0)
        {
            System.out.print("Bob"); 
        }else System.out.print("Alice"); 
    }

}