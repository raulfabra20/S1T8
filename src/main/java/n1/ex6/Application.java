package n1.ex6;

import java.util.ArrayList;
import java.util.Collections;

public class Application {
    public static void testApp(){
        ArrayList<String> list = new ArrayList<>();
        addElements(list);
        sortList(list);
        printSortedList(list);

    }
    public static void addElements(ArrayList<String> list){
        list.add("orange");
        list.add("78541239");
        list.add("eye");
        list.add("treehouse");
        list.add("20");
        list.add("1997");
    }

    public static void sortList(ArrayList<String> list){
        Collections.sort(list, (a, b) -> Integer.compare(a.length(), b.length()));
    }

    public static void printSortedList(ArrayList<String> list){
        System.out.println(list);
    }

}
