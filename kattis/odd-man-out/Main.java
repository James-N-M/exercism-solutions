import java.util.*; 
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner keyboard= new Scanner(System.in);
        
        int N, G, C; 
        int array[],count[];
        int counter = 0 ; 
        N = keyboard.nextInt(); 
        keyboard.nextLine();
        
        for(int i = 0 ; i < N; i++)
        {
            G = keyboard.nextInt();
            keyboard.nextLine(); 
            
            array = new int [G];
            count = new int [G];
            
            for(int p = 0; p < G; p++)
            {
                array[p] = keyboard.nextInt();
            }
            
            for(int y = 0; y < G; y++)
            {
                counter = 0; 
                C = array[y];
                for(int x = 0; x < G; x++)
                {
                    if(C == array[x])
                    {
                        counter++;
                    }
                }
                count[y] = counter;
            }
            
            for(int q = 0 ; q < G; q++)
            {
                if(count[q] == 1)
                {
                    System.out.println("Case #"+(i+1)+": " + array[q]);
                    break;
                }
            }
        }
        
    }

}