import java.util.*; 
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String output = ""; 
         Scanner scanner = new Scanner(System.in);
        
        String Sentence = scanner.nextLine();
        String[] words=Sentence.split("-");//splits the string based on whitespace  
        for(String w : words)
        {
            output+=w.charAt(0); 
        }
        System.out.println(output);
    }

}