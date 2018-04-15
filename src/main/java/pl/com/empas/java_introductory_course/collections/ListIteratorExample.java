package pl.com.empas.java_introductory_course.collections;

import java.util.*;

public class ListIteratorExample {
    private List<String> linkedList = new LinkedList<>();

    public void addToList(Collection<String> collection){
        this.linkedList.addAll(collection);
    }
    public void modifyList(String elementToInsert, String elementToInsertAfter){
        ListIterator<String> iterator =linkedList.listIterator();
        for(String s=null;iterator.hasNext();s=iterator.next()){
            if(elementToInsertAfter.equals(s)){
                iterator.add(elementToInsert);
            }
        }

    }
    public void substitute(String elementToInsert, String elementToSubstitute){
        ListIterator<String> iterator =linkedList.listIterator();
        while(iterator.hasNext()){
            String s=iterator.next();
            if(s.equals(elementToSubstitute)){
                iterator.set(elementToInsert);
                break;
            }
        }
    }

    public static void main(String [] args){
        ListIteratorExample example = new ListIteratorExample();
        Collection<String> collection = Arrays.asList("Apple","Banana","Orange","grapefruir");
        example.addToList(collection);
        example.modifyList("Pomelo","Orange");
        example.substitute("apple","Pomelo");
        System.out.println(example.linkedList);

    }
}
