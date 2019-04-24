import java.util.*; 
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int n, x = 1, value; 
        String animal,temp[];
        
        Scanner myScanner = new Scanner(System.in); 
        
        n = myScanner.nextInt(); 
        myScanner.nextLine(); // captures the new line 
        while(n != 0)
        {
            // Create a HashMap
            TreeMap tm = new TreeMap<String,Integer>(); 
            for(; n > 0; n--)
            {
                animal = myScanner.nextLine();
                temp = animal.split(" "); 
                animal = temp[temp.length-1].toLowerCase(); 
                if(!tm.containsKey(animal))
                {
                    tm.put(animal, new Integer(1));
                }else
                {
                    
                    value = (int) tm.get(animal);
                    tm.put(animal, new Integer(value+1));
                }
            }
            printMap(tm,x);
            x++; 
            n = myScanner.nextInt(); 
            myScanner.nextLine(); // captures the new line 
        }// End of While Loop 
        
        
        
    }
    
    static void printMap(TreeMap list,int x)
    {
          // Get a set of the entries
          Set set = list.entrySet();
          
          // Get an iterator
          Iterator i = set.iterator();
          
          System.out.println("List " + x +":");
          // Display elements
          while(i.hasNext()) {
             Map.Entry me = (Map.Entry)i.next();
             System.out.print(me.getKey() + " | ");
             System.out.println(me.getValue());
          }
    }
    

}