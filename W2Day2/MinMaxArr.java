
import java.util.*;
public class MinMaxArr {
	public static void main(String args[])
	{
		ArrayList<Integer> A = new ArrayList<>();
		A.add(15);
		A.add(20);
		A.add(8);
		A.add(43);
		A.add(21);
		A.add(31);

		int min = A.get(0);
		int max = A.get(0);
		int n = A.size();

        System.out.println("Before Replacing: ");
          
        for (int i : A) {
            
            System.out.print(" "+i);
            
        }
        System.out.println();
       
        A.set(3, 10);
        
        System.out.println("After replacing: ");
        for (int i : A) {
            
            System.out.print(" "+i);
            
        }
        System.out.println();


		for (int i = 1; i < n; i++) {
			if (A.get(i) < min) {
				min = A.get(i);
			}
		}

		for (int i = 1; i < n; i++) {
			if (A.get(i) > max) {
				max = A.get(i);
			}
		}

        System.out.println();
		System.out.println("Maximum is : " + max);
		System.out.println("Minimum is : " + min);
	}
}


