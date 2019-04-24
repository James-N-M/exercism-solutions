import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in); 
        String arr []; 
        String vowels [] = {"a","e","i", "o", "u"}; 
        String output = ""; 
        arr = input.nextLine().split(""); 
        
        for(int i = 0 ; i < arr.length; i++)
        {
            for(int y = 0 ; y < vowels.length; y++)
            {
                if(arr[i] != null) // save from null pointer
                if(arr[i].matches(vowels[y]))
                {
                    arr[i+1] = null;
                    arr[i+2] = null; 
                    break;
                }
            }
        }
        
        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i]!=null)
            {
                output += arr[i]; 
            }
        }
    System.out.print(output);   
    }

}