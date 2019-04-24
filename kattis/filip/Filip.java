import java.util.*;
public class Filip {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x, y;
        int x2,y2; 
        Scanner myScanner = new Scanner(System.in); 
        x = myScanner.nextInt();
        y = myScanner.nextInt();
        
        
        x2 = Filip.reverseInteger(x);
        y2 = Filip.reverseInteger(y);
        
        if(x2 > y2)
        {
            System.out.println(x2);
        }else System.out.println(y2);
        
        
    }
    
    public static int reverseInteger(int theNumber)
    {
        int reverse = 0;
        while(theNumber != 0)
        {
            reverse = reverse * 10 ; 
            reverse = reverse + theNumber%10;
            theNumber = theNumber/10;
        }
        return reverse; 
    }

}