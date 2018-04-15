package pl.com.empas.java_introductory_course.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiDimensionalList {
    public static void main (String [] args){
        List<List<Integer>> twoDimList = new ArrayList<>();
        List<Integer> baseList1 = new ArrayList<>();
        List<Integer> baseList2 = new ArrayList<>();
        for(int i =0; i<10;i++){
            List<Integer> list = new ArrayList<>();
            twoDimList.add(list);
            for(int a = 10; a>=i;a--){
                list.add(a);
            }

        }
        for(List<Integer> i : twoDimList){
            Iterator<Integer> iterator = i.iterator();
            int sum = 0;
            while (iterator.hasNext()){
                sum += iterator.next();
            }
            System.out.println("Sum of dim "+ twoDimList.indexOf(i)+" "+sum );
        }


        System.out.println(twoDimList);

    }
}
