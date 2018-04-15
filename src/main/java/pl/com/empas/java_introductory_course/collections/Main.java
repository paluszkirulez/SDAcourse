package pl.com.empas.java_introductory_course.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>(1000);
        myList.add("Jablka");
        myList.add("Gruszki");
        //myList.add(22,44);
        myList.add("Banana");
        myList.add("Grapes");
        myList.add("Strawberies");


        myList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });


        for(String i : myList){
            System.out.println(i);
        }
        System.out.println(myList.size());
    }
}
