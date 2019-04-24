import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);
        
        int N; 
        
        N = keyboard.nextInt(); 
        keyboard.nextLine(); 
        
        char array1[] = keyboard.nextLine().toCharArray(); // input Array
        char array2 [] = keyboard.nextLine().toCharArray(); // Output after switches
    
        
        
        
        for(int i = 0 ; i < N ; i ++)
        {
            for(int y = 0 ; y < array1.length; y++)
            {
                if(array1[y] == '0')
                {
                    array1[y] = '1';
                }
                else
                {
                    array1[y] = '0';
                }
            }
        }
        
        
        for(int i = 0 ; i < array1.length; i++)
        {
            if(array1[i] != array2[i])
            {
                System.out.println("Deletion failed");
                return;
            }
        }
        
        System.out.println("Deletion succeeded");
        
        
        
        
        
    }

}
