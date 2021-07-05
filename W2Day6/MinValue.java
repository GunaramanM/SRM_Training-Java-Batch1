import java.util.ArrayList;
import java.util.Iterator;
public class MinValue {


		   static void front(ArrayList < Integer > ref){

		       int miniIndex = 0;

		       for(int i=1; i<ref.size(); i++){

		          if(ref.get(miniIndex) > ref.get(i))

		               miniIndex = i;

		      }

		       int min = ref.get(miniIndex);

		       ref.remove(miniIndex);

		       ref.add(0, min);

		  }

		  public static void main(String[] args) {

		       ArrayList<Integer> ref = new ArrayList<>();

		     ref.add(3); 
		     ref.add(8);
		     ref.add(92);
		     ref.add(4);
		     ref.add(2);
		     ref.add(17);
		     ref.add(9);

		      System.out.println(ref);

		      front(ref);

		      System.out.println(ref);

		  }

		}

