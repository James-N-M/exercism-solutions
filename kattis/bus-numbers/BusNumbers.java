import java.util.*; 
public class BusNumbers {

   public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);
        int array [];
        int Count = 1;
        int y = 0;
        int N = keyboard.nextInt();
        keyboard.nextLine();
        
        array = new int [N];
        
        for(int i = 0 ; i < N; i++)
        {
            array[i] = keyboard.nextInt();
        }
        
        Arrays.sort(array);
        
        /* Print out the contents of the array 
        for(int i = 0 ; i < N; i++)
        {
            System.out.println(array[i]);
        }
        */
        
        for(int i = 0 ; i < N; i++)
        {
            for(y = i+1; y < N; y++)
            {
                if((array[i]+Count) != array[y])
                {
                    break;
                }
                Count++;
            } //end of y loop
            
            if(Count > 2)
            {
                System.out.print(array[i] + "-" + array[y-1] + " ");
                i = y-1;
            }
            else if(Count == 1)
            {
                System.out.print(array[i] + " ");
            }
            else
            {
                System.out.print(array[i] + " " + array[y - 1] + " ");
                i = y - 1;
            }
            Count = 1;
        }
    
}
}
