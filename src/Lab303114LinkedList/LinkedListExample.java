package Lab303114LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        //LL declaration
        LinkedList<String> linkedList = new LinkedList<String>();

        //add String element
        linkedList.add("Item1");
        linkedList.add("Item5");
        linkedList.add("Item3");
        linkedList.add("Item6");
        linkedList.add("Item2");

        //Display content of LL
        System.out.println("Linked List contents:" + linkedList);

        //add an element at the beginning and at the end
        linkedList.addFirst("First Item");
        linkedList.addLast("Last Item");
        System.out.println("Linked List after adding a first and last item: " + linkedList);

        //getting and setting values
        Object firstVar = linkedList.get(0);
        System.out.println("First Element stored in Object Variable: " + firstVar);
        linkedList.set(0, "Changed first item");
        Object firstVar2 = linkedList.get(0);
        System.out.println("Element get with an object variable now being stored in first spot of linkedList" + firstVar2);

        //remove first and last element
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + linkedList);

        //add to a position and remove from a position
        linkedList.add(0,"Newly added item");
        linkedList.remove(2);
        System.out.println("Final content: " + linkedList);
     }
}
