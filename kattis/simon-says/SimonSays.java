import java.util.*; 
/**
 *
 * @author james
 */
public class SimonSays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in); 
        int N = keyboard.nextInt(); 
        keyboard.nextLine(); 
        
        
        for(int i = 0 ; i < N; i++)
        {
            String input = keyboard.nextLine();
            
            if(!input.isEmpty() && input.length() >= 10)
            if( input.substring(0, 10).matches("Simon says") )
            {
                System.out.println(input.substring(11, input.length() ));
            }
        }
    }
    
}