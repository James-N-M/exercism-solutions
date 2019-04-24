import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in); 
        int chessSet [] = {1,1,2,2,2,8};
        int userInput [] = new int [6]; 
        int output [] = new int [6];  
        
        for(int i = 0 ; i < 6; i++)
        {
            userInput[i] = input.nextInt(); 
        }
        
        for(int i = 0  ; i < 6; i++)
        {
            output[i] = (chessSet[i] - userInput[i]); 
        }
        
        for(int i = 0 ; i < 6; i++)
        {
            System.out.print(output[i]+ " ");
        }
        
    }

}
