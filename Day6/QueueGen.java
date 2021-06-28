package Day6;

import java.util.*;

public class QueueGen<T> {

    public static void main(String[] args) {

        Queue<String> name = new PriorityQueue<>();

        name.add("Aman");
        name.add("Derec");
        name.add("Guna");
        System.out.println("Names in string: " + name);

        name.remove();
        System.out.println("after removing: " + name);

    }

}
