import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int n, a = 0,b = 0,g = 0;
        String answers []; 
        String Adrian = "ABC";
        String Atemp = ""; 
        String Bruno  = "BABC";
        String Btemp = ""; 
        String Goran  = "CCAABB";
        String Gtemp = ""; 
        
        Scanner scan = new Scanner(System.in); 
        n = scan.nextInt(); 
        scan.nextLine();
        answers = scan.nextLine().split("");
        
        for(int i = 0 ; i < 100; i++)
        {
            Atemp += Adrian;
            Btemp += Bruno;
            Gtemp += Goran; 
        }
        
        String a1 [] = Atemp.split("");
        String b1 [] = Btemp.split("");
        String g1 [] = Gtemp.split(""); 
        
        for(int i = 0 ; i < n; i++)
        {
            if(a1[i].matches(answers[i]))
            {
                a++;
            }
            if(b1[i].matches(answers[i]))
            {
                b++;
            }
            if(g1[i].matches(answers[i]))
            {
                g++;
            }
        }
        
        int done = Math.max(a,(Math.max(b,g)));
        System.out.println(done);
        if(a == done) System.out.println("Adrian");
        if(b == done) System.out.println("Bruno");
        if(g == done) System.out.println("Goran");
        
        scan.close();
    }

}
