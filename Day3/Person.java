package Day3;
class person{
	String Name;
	int Age;
	int Phonenumber;
	String Address;
	int Salary;
	void printsalary(){
		System.out.println("salary="+this.Salary);
	}
}
class Employee extends person{
	String specialization;
	String department;
}
class Manager extends person{
	String specialization;
	String department;	
}
 class personmain {

	public static void main(String[] args) {
		Employee A=new Employee();
		A.Name="GUNARAMAN M";
	    A.Age=23;
		A.Phonenumber=9094750;
		A.Address="chennai";
		A.specialization="Full stack developer";
		A.department="ccx";
		A.Salary=30000;
		System.out.println("name="+A.Name);
		System.out.println("age="+A.Age);
		System.out.println("number="+A.Phonenumber);
		System.out.println("address="+A.Address);
		System.out.println("specialization="+A.specialization);
		System.out.println("department="+A.department);
		A.printsalary();
		System.out.println("");
		Manager B=new Manager();
		B.Name="Prashanth";
	    B.Age=35;
		B.Phonenumber=99999;
		B.Address="chennai";
		B.specialization="Manager";
		B.department="CCX";
		B.Salary=90000;
		B.printsalary();
		System.out.println("name="+B.Name);
		System.out.println("age="+B.Age);
		System.out.println("number="+B.Phonenumber);
		System.out.println("address="+B.Address);
		System.out.println("specialization="+B.specialization);
		System.out.println("department="+B.department);
		B.printsalary();
	}
 }