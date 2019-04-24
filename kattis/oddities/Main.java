//package oddities;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in); 
        
        int N; // number of test Cases
        int x; 
        N = input.nextInt(); 
        
        for(int i = 0 ; i < N ; i ++)
        {
            x = input.nextInt();
            System.out.println(x + " is " + Main.evenOrOdd(Math.abs(x)));
        }
        
    }
    
    public static String evenOrOdd(int x)
    {
        if((x % 2) == 0)
        {
            return "even";
        }
        else
        {
            return "odd"; 
        }
        
    }

}
