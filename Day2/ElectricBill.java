package Day2;
import java.util.Scanner;
class ElectBill {
int ConsumerNo;
String ConsumerName;
int PrevReading;
int CurrReading;
String EBConn;
double Bill;
void input_data()
{
Scanner sc = new Scanner(System.in);
System.out.println("\n Enter Consumer Number: ");
ConsumerNo = sc.nextInt();
System.out.println("\n Enter Consumer Name: ");
ConsumerName = sc.next();
System.out.println("\n Enter Previous Units: ");
PrevReading = sc.nextInt();
System.out.println("Enter Current Units consumed:");
CurrReading = sc.nextInt();
System.out.println("Type of EB Connection(domestic- D / commercial- C)");
EBConn = sc.next();
}
double calculate_bill()
{
if(EBConn.equals("D"))
{
if(CurrReading>=0 && CurrReading<=100)
Bill=CurrReading*1;
else if(CurrReading>100 && CurrReading <= 200)
Bill=CurrReading*2.5;
else if(CurrReading>200 && CurrReading <= 500)
Bill=CurrReading*4;
else
Bill=CurrReading*6;
}
else
{
if(CurrReading>=0 && CurrReading<=100)
Bill=CurrReading*2;
else if(CurrReading>100 && CurrReading <= 200)
Bill=CurrReading*4.5;
else if(CurrReading>200 && CurrReading <= 500)
Bill=CurrReading*6;
else
Bill=CurrReading*7;
}
return Bill;
}
void display()
{
System.out.println("ELCTRICITY BILL");
System.out.println("Consumer Number: "+ConsumerNo);
System.out.println("Consumer Name: "+ConsumerName);
System.out.println("Consumer Previous Units: "+PrevReading);
System.out.println("Consumer Current Units: "+CurrReading);
System.out.println("Type of EBConnection: "+EBConn);
System.out.println("");
System.out.println("Total Amount Rs. "+Bill);
}

class ElectricBill
{
public static void main (String[] args)
{
ElectBill b=new ElectBill();
b.input_data();
b.calculate_bill();
b.display();
}
}
}
