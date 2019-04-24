import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in); 
        
        int s1,v1,v2; 
        
        s1 = input.nextInt();
        v1 = input.nextInt();
        v2 = input.nextInt();
        
        int large = s1 / v1; 
        int total = s1 - (s1 % v1);
        int small = 0 ; 
        
        //System.out.print(large + " " + total);
        
        while(((s1 - total) % v2) != 0)
        {
            total -= v1; 
            large--; 
            if(total < 0){ 
                System.out.println("impossible");
                return;
            }
        }
        
        small = (s1 - total) / v2; 
        
        System.out.println(large + " " + small);
    }

}
