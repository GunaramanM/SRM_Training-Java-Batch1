import java.io.*;
import java.util.*;
  
class HashTab {
    public static void main(String args[])
    {
        Hashtable<Integer, String> A1 = new Hashtable<>();
        Hashtable<Integer, String> A2
            = new Hashtable<Integer, String>();
  
        A1.put(1, "one");
        A1.put(2, "two");
        A1.put(3, "three");
  
        A2.put(4, "four");
        A2.put(5, "five");
        A2.put(6, "six");
  
        System.out.println("Mappings of Hashtable 1 : " + A1);
        System.out.println("Mappings of Hashtable 2 : " + A2);

        A1.replace(3, "three", "replaced");
        System.out.println("Mappings of Hashtable 1 : " + A1);

    }
}
