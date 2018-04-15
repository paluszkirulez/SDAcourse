package pl.com.empas.java_introductory_course.collections;



import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Character,Integer> myMap = new HashMap<>();
        String testString = "dkaofjadjada;dka;djasjfijadfjiaj".toLowerCase();
        for(int i=0; i<testString.length();i++){

            Character a = testString.charAt(i);
            if(Character.isAlphabetic(a)) {
                if (!myMap.containsKey(a)) {
                    myMap.put(a, 1);
                } else {
                    myMap.put(a, myMap.get(a) + 1);
                }
            }
        }
        System.out.println(myMap);
        System.out.println(HashMapTest.getMaxString(myMap,testString));

    }

    public static String getMaxString(Map<Character, Integer> myMap, String testString){
        String b = "";
        int myValue = 0;
        for(int i = 0; i<myMap.size();i++){
            Character a = testString.charAt(i);
            if(Character.isAlphabetic(a)) {
                if (myMap.containsKey(a)) {
                    if (myMap.get(a) > myValue) {
                        myValue = myMap.get(a);
                        b = "";
                        b = b+ a;
                    }
                }
            }
        }
        String myReturn = b + " = " + myValue;
        return myReturn;
    }
}


