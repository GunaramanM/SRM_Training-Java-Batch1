import java.io.*;
class SerialDeserial implements Serializable
{
    String name;
    int rid;
    SerialDeserial(String n, int r)
    {
    this.name = n;
    this.rid = r;
    
    }
}

class Demo
{
    public static void main(String[] args)
    {
        try
        {
            SerialDeserial si = new SerialDeserial("Guna", 104);
            FileOutputStream fos = new FileOutputStream("SRM_Training_Week3/W3Day6/New.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.flush();
            oos.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

