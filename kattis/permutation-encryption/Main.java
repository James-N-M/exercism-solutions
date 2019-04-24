import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);
        
        int N;
        int key []; 
        char buffer[]; 
        
        while((N = keyboard.nextInt()) != 0)
        {
            key = new int [N];
            buffer = new char[N];
            String output = "";
            
            for(int i = 0 ; i < N; i++)
            {
                key[i] = keyboard.nextInt();
            }
            keyboard.nextLine();
            
            
            
            String input = keyboard.nextLine();
            
            while((input.length() % N) != 0)
            {
                input += " ";
            }
            
            // Unsure code
            for(int i = 0 ; i < input.length();)
            {
                
                for(int y = 0 ; y < N; y++)
                {
                    buffer[y] = input.charAt(i);
                    i++;
                }
                
                for(int x = 0; x < N; x++)
                {
                    output += buffer[(key[x])-1];
                }
                
            }
            System.out.println("'" + output + "'");
            // SAFETY ZONE
        }
        
        
        
        
    }

}