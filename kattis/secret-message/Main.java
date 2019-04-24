import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int L, M, N,K;
        Scanner keyboard = new Scanner(System.in); 
        
        N = keyboard.nextInt();
        keyboard.nextLine();
        for(int k = 0; k < N; k++)
        {
            
        
        String input = keyboard.nextLine();
        
        L = input.length();
        M = findM(L);
        K = findK(M);
        
        String array[][] = new String [K][K]; 
        String output[][] = new String [K][K];
    
        for(int i = 0 ; i < Main.findM_L(M, L); i++)
        {
            input += "*";
        }
        
        String inputArray [] = input.split("");
        int p = 0; // counter for inputArray 
        
        for(int i = 0; i < K; i++)
        {
            for(int j = 0 ; j < K; j++)
            {
                array[i][j] = inputArray[p];
                p++;
            }
        }
        
        Main.rotateArray(array, output);
        
        String outputL = ""; 
        for(int i = 0; i < K; i++)
        {
            for(int j = 0 ; j < K; j++)
            {
                char fuck = output[i][j].charAt(0);
                if(fuck != '*')
                outputL += output[i][j];
            }
            
        }
            System.out.println(outputL);
        }
        
        
    }
    
    public static int findM(int L)
    {
        int i = 1; 
        while((i*i) < L)
        {
            i++;
        }
        return (i*i);
    }
    
    public static int findK(int M)
    {
        int i = 1;
        
        while((i*i) != M)
        {
            i++;
        }
        
        return i; 
    }
    
    public static int findM_L(int M, int L)
    {
        return (M - L);
    }
    
    
    public static void rotateArray(String arr1[][], String arr2[][])
    {
        
        int n = arr1.length;
        
        for(int i = 0 ; i < n; i++)
        {
            for(int j = 0 ; j < n; j++)
            {
                arr2[i][j] = arr1[n- j - 1][i];
            }
        }
        
    }

}