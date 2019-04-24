import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in); 
        int array [][] = new int [5][4]; 
        
        for(int i = 0 ; i < 5; i++)
        {
            for(int y = 0 ; y < 4; y++)
            {
                array[i][y] = input.nextInt(); 
            }
        }
        
        
        int max = 0; 
        int sum = 0; 
        int X = 1; 
        
        for(int i = 0 ; i < 5; i++)
        {
            for(int y = 0 ; y < 4; y++)
            {
                sum += array[i][y];
            }
            if(sum > max)
            {
                X = i+1;
                max = sum; 
            }
            sum = 0; // set sum back to 0 
        }
        
        System.out.println(X + " " + max);
    }

}