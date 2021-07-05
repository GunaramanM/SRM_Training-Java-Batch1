import java.util.*;
public class RemArr {
	
	
	
	public static void main(String args[]){
	
	     ArrayList<String> list = new ArrayList<String>();
	     list.add("one");
	     list.add("two");
	     list.add("three");
	     list.add("four");
		 list.add("five");
	            
	    
	     
	     Iterator<String> A1 = list.iterator();
	     while(A1.hasNext()) {
	      if(A1.next().length()%2==0) {
	        A1.remove();
	       }
	     }
	     System.out.println(list);
	    
	    }
	
	
}