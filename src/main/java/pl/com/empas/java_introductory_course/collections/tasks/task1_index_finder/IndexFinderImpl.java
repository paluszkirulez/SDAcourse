package pl.com.empas.java_introductory_course.collections.tasks.task1_index_finder;

import pl.com.empas.java_introductory_course.collections.common.FruitGenerator;

import java.util.ArrayList;
import java.util.List;

public class IndexFinderImpl<E> implements IndexFinder<E> {


    public static void main(String args[]) {
        IndexFinderImpl<String> indexFinder = new IndexFinderImpl<>();
        List<String> fruitList = FruitGenerator.getFruitList();

        System.out.println(fruitList);
        int orangeIndex = indexFinder.findFirstIndexOf("Orange", fruitList);
        int carrotIndex = indexFinder.findFirstIndexOf("Carrot", fruitList);

        System.out.println("List index of 'Orange' is: " + orangeIndex);
        System.out.println("List index of 'Carrot' is: " + carrotIndex);

        //---------------------------
        List<Integer> orangeIndexes = indexFinder.findAllIndexesOf("Orange", fruitList);
        List<Integer> carrotIndexes = indexFinder.findAllIndexesOf("Carrot", fruitList);
        System.out.println("All indexes of 'Orange' are: " + orangeIndexes);
        System.out.println("All indexes of 'Carrot' are: " + carrotIndexes);
    }

    /*
    Create implementation of the IndexFinder interface.

     */
    @Override
    public Integer findFirstIndexOf(E elem, List<E> list) {


        int finInteger = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(elem)) {
                finInteger = i;
                break;
            }
        }
        return finInteger;
    }

    @Override
    public List<Integer> findAllIndexesOf(E element, List<E> list) {

        List<Integer> resoultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element)) {
                resoultList.add(i);
            }
        }
        if(resoultList.size()==0){
            resoultList.add(-1);
        }
        return resoultList;
    }
}
