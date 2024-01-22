package Lab303114LinkedList;

import java.util.*;

public class LinkedListSortExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

        System.out.println("Unsorted LL : " + linkedList);

        //now lets sort the list
        Collections.sort(linkedList);

        System.out.println("Sorted LL: " + linkedList);

        Collections.sort(linkedList,Collections.reverseOrder());

        System.out.println("Custom sorting of our list, using the Collections method reverseOrder(): " + linkedList);

    }
}
