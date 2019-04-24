import java.util.*;
public class Main {

   public static void main(String args[]) {
      
       int n, x, total = 0; 
       
       Scanner myScanner = new Scanner(System.in); 
       
       
       n = myScanner.nextInt(); 
       
       for(int i = 0 ; i < n; i ++)
       {
           x = myScanner.nextInt(); 
           int stores [] = new int[x]; 
           for(int y = 0 ; y < x; y++)
           {
               stores[y] = myScanner.nextInt(); 
           }
           Arrays.sort(stores);
          // System.out.println(Arrays.toString(stores));

           for(int z = 0 ; z < stores.length - 1; z++)
           {
               total += stores[z+1] - stores[z];  
           }
           System.out.println(total*2);
           total = 0 ; 
       }
       
   }
}