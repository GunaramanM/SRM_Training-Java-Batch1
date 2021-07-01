package Employee;
import java.util.*;
import  Employee.*;



class Emp
{
	public static void print(LinkedList<EmpVal > linkedList1)
	{
		List<EmpVal > result1 = linkedList1.stream().collect(Collector.toList());
			        
					 result1.forEach(p -> System.out.println("Employee no::"+p.getEno()+"\n "+"Employee Name::"+p.getEname()+"\n "+"Designation::"+p.getEdesignation()));
					 
		
	}
}

public class EmpBase implements In{

	public static void main(String[] args)
	{
		LinkedList<EmpVal > linkedList1 = new LinkedList<>();
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("enter num of records");
		
		int maxrec=scnr.nextInt();

		for (int j = 0; j <= maxrec; j++) 
		{

			EmpVal ob=new EmpVal();

			System.out.println("Enter Employee id:");
			ob.setEno(scnr.next());

			System.out.println("Enter Employee name:"+" ");
			ob.setEname(scnr.next());

			System.out.println("Enter Employee Designation:");
			ob.setEdesignation(scnr.next());

			linkedList1.add(ob);
			

		}
		Emp em=new Emp();
		em.print(linkedList1);
	}

}
