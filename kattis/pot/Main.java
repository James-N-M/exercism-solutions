import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in); 
        int N; 
        int y;
        long X = 0; 
        
        N = input.nextInt();
        for(int i = 0 ; i < N; i++)
        {
            y = input.nextInt(); 
            X += Math.pow((y/10), (y%10)); 
        }
        
        System.out.println(X);
    }

}