import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner myScanner = new Scanner(System.in); 
        
        int x,y,n,carry = 0; 
        
        x = myScanner.nextInt();
        n = myScanner.nextInt(); 
        
        for(int i = 0 ; i < n; i++)
        {
            y = myScanner.nextInt(); 
            if(i == 0)
            {
                carry = x - y; 
            }
            else
            {
                carry = (x + carry) - y;
            }
        }
        
        System.out.println(carry + x);
        
        
    }

}