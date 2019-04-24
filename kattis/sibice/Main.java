import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double n,x,y,sqroot;//,max; 
        Scanner myScanner = new Scanner(System.in);  
        
        // Read in integers 
        n = myScanner.nextInt();
        x = myScanner.nextInt();
        y = myScanner.nextInt(); 
        
        
        sqroot = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); 
        
        int max = (int) Math.max(Math.max(x, y),sqroot); // gross typecasting 
        
        for(int i = 0 ; i < n; i++)
        {
            Fits(max, myScanner.nextInt()); 
        }
        
    }
    
    
    public static void Fits(int max, int someshit)
    {
        if(someshit <= max)
        {
            System.out.println("DA");
        }else
        {
            System.out.println("NE");
        }
    }
    
    

}
