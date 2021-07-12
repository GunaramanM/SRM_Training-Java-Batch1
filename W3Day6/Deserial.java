import java.io.*;

class Deserial implements Serializable
{
    String name;
    int rid;
    Deserial(String n, int r)
    {
    this.name = n;
    this.rid = r;

    }
}

class Deserialize
{
    public static void main(String[] args)
    {
        SerialDeserial si=null ;
        try
        {
            FileInputStream fis = new FileInputStream("SRM_Training_Week3/W3Day6/New.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            si = (SerialDeserial)ois.readObject();
        }
        catch (Exception e)
        {
            e.printStackTrace(); }
            System.out.println(si.name);
            System.out. println(si.rid);
           
        }
}


