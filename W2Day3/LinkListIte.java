 
import java.util.*;  
public class LinkListIte {  
   public static void main(String[] args) {  
  List<String> list = new LinkedList<>();  
   list.add("Welcome");  
   list.add("to");  
   list.add("our");  
   list.add("website");  

    System.out.println("The list is given as : "+list);  
    Iterator<String> itr = list.iterator();   

   while(itr.hasNext()) {  
       System.out.println(itr.next());  
       }
   itr.remove(); 
   System.out.println("After Remove: "+list);  

  list.add("organisation");
  System.out.println("After Add: "+list);  
   }  
} 

