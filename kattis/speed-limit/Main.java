import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in); 
        int arraySolution [];
        int array1 [], array2 []; 
        
        int n; // pairs
        
        
        while((n = input.nextInt()) != -1) 
        {
            arraySolution = new int [n]; 
            array1 = new int [n];
            array2 = new int [n];  
            
            for(int i = 0 ; i < arraySolution.length; i++)
            {
                array1[i] = input.nextInt();
                array2[i] = input.nextInt();
            }
            
            if(n > 1)
            {
                for(int i = n-1; i > 0; i--)
                {
                    arraySolution[i] = array1[i] * (array2[i] - array2[i-1]);
                }
            }
            
            
            arraySolution[0] = array1[0] * array2[0]; 
            int sum = 0 ; 
            for(int i = 0; i < arraySolution.length; i++)
            {
                sum+= arraySolution[i]; 
            }
            
            System.out.println(sum + " miles");
        }
        
    }

}