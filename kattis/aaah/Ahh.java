import java.util.*; 
/**
 *
 * @author james
 */
public class Ahh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        String input = keyboard.nextLine();
        String doctor = keyboard.nextLine();
        int count1;
        int count2;
        
        count1 = input.length() - 1;
        count2 = doctor.length() - 1;
        
        if(count1 == count2)
        {
            System.out.println("go"); 
        }
        else if(count1 >= count2)
        {
            System.out.println("go");
        }
        else
        {
            System.out.println("no"); 
        }
        
    }
    
}