import java.util.*;
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in); 
        int  N;
        N = input.nextInt(); 
        long array[] = new long [N]; 
        
        for(int i = 0 ; i < N ; i++)
        {
            array[i] = input.nextLong(); 
        }
        int count = 0;
        
        for(int i = 0; i < N; i++)
        {
            if(array[i] < 0)
            {
                count++;
            }
        }
        
        System.out.print(count); 
        
        
        
    }

}