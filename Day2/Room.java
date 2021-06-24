package Day2;
public class Room {
    int roomNo;
    String roomType;
    double roomArea;
    boolean acMachine;

void setData(int A, String B, double C,Boolean D)
{
roomNo=A;
roomType=B;
roomArea=C;
acMachine=D;
}
void displayData()
{
System.out.println("The room number is: "+ roomNo);
System.out.println("The room type is: "+ roomType);
System.out.println("Area of the room is: "+roomArea);
System.out.println("Does the room have AC? "+acMachine);

}
public static void main(String[] args)
{
Room room1= new Room();
room1.setData(1030, "Medium", 420.50, true);
room1.displayData();
}
}