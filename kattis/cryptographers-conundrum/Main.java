//package conundrum;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);
        
        String [] input;
        int count = 0 ; 
        input = keyboard.nextLine().split("");
        
        for(int i = 0 ; i < input.length;)
        {
            if( !input[i].matches("P") && i < input.length)
            {
                input[i] = "P";
                count++;
            }
            i++;
            if( !input[i].matches("E")&& i < input.length)
            {
                input[i] = "E";
                count++;
            }
            i++;
            if( !input[i].matches("R") && i < input.length)
            {
                input[i] = "R";
                count++;
            }
            i++;
        }
        
        System.out.println(count);
        
        
        
    }

}