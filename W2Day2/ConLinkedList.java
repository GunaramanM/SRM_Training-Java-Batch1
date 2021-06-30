import java.util.*;
public class ConLinkedList {
 public static void main(String[] args) {
  LinkedList <Integer> c1 = new LinkedList <Integer> ();
  
          c1.add(5);
          c1.add(88);
          c1.add(54);
          c1.add(19);
          c1.add(33);
          System.out.println("List of first linked list: " + c1);
         LinkedList <Integer> c2 = new LinkedList <Integer> ();
          c2.add(28);
          c2.add(15);
          c2.add(99);
          c2.add(45);
          System.out.println("List of second linked list: " + c2);
        
        LinkedList <Integer> a = new LinkedList <Integer> ();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New linked list: " + a);
             }
}

