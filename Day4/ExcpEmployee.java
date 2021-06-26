package Day4;
class PayException extends Exception{
	private int bpay;
	PayException(int bpay){
		this.bpay=bpay;
	}
	public String toString() {
		return ("Pay not valid for this employee="+" "+bpay);
	}
}

class Employee  {
	private String eno;
	private String ename;
	private int bpay;
	Employee(String eno,String ename,int bpay){
		this.eno=eno;
		this.ename=ename;
		this.bpay=bpay;
	}
	public void display() {
		try {
		System.out.println("Emp No:"+eno);
		System.out.println("Emp Name:"+ename);
		if(bpay<10000){
			throw new PayException(bpay);
		}
		System.out.println("Basic Pay:"+bpay);
		}
		catch(PayException pay){
			System.out.println(pay);
		}
	}
		
}
public class ExcpEmployee {

	public static void main(String[] args) {
		Employee obj=new Employee("A0011","Guna",5000);
		 obj.display();
	

	}
}