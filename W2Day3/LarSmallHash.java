import java.util.*;

public class LarSmallHash {
	public static void main(String[] args)
    {
       HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 37);
        map.put(2, 63);
        map.put(3, 17);
        map.put(4, 29);
        map.put(5, 45);

        System.out.println(map);
 
        int maxValue=(Collections.max(map.values()));
        int minValue=(Collections.min(map.values()));
        int maxKey=(Collections.max(map.keySet()));
        int minKey=(Collections.min(map.keySet()));
        
        System.out.println("Largest Key in map: "+maxKey);
        System.out.println("Smallest Key in map: "+minKey);
        System.out.println("Largest Value in map: "+maxValue);
        System.out.println("Smallest Value in map: "+minValue);

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            System.out.println(String.format("Key (name) is: %s, Value (age) is : %s", pair.getKey(), pair.getValue()));   
        }
        
        
        
    }

}