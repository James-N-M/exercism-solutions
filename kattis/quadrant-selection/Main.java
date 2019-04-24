import java.util.*; 
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x, y;
        Scanner myScanner = new Scanner(System.in); 
        
        x = myScanner.nextInt();
        y = myScanner.nextInt(); 
        
        if(x > 0 && y > 0) 
        {
            System.out.println("1"); 
        }
        else if(x < 0 && y > 0) 
        {
            System.out.println("2"); 
        }
        else if(x < 0 && y < 0) 
        {
            System.out.println("3"); 
        }
        else 
        {
            System.out.println("4"); 
        }
    }

}