import java.util.*;
public class Prop {

   public static void main(String args[]) {
      Properties alphabet = new Properties();
      Set alp;
      String str;
      
      alphabet.put("A", "a");
      alphabet.put("B", "b ");
      alphabet.put("C", "c");

      alp = alphabet.keySet();
      Iterator itr = alp.iterator();
      
      while(itr.hasNext()) {
         str = (String) itr.next();
         System.out.println("The small letter of " + str + " is " + 
         alphabet.getProperty(str) );
      }     
      System.out.println();

   }
}

