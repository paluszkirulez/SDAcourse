package pl.com.empas.java_introductory_course.collections;

import java.util.*;

public class LinkedListAttempt {
    public static void main(String[] args) {
        Deque<String> myLinkedList = new LinkedList<>();
        myLinkedList.addFirst("String1");
        myLinkedList.add("String2");
        myLinkedList.add("String3");
        myLinkedList.add("string8");
        String c = myLinkedList.pop();
        String b = myLinkedList.peekFirst();
        String a = myLinkedList.peekLast();
        System.out.println(a+ " "+b + " "+c);
        for(String i : myLinkedList){
            System.out.println(i);

        }
        ArrayList<String> nextList = new ArrayList<String>();
        nextList.addAll(myLinkedList);
        Iterator<String> iterator = nextList.listIterator();
        //iterator.
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
