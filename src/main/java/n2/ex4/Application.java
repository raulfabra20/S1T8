package n2.ex4;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void testApp() {
        List<String> list = new ArrayList<>();

        list.add("mobile");
        list.add("egg");
        list.add("4");
        list.add("dragonfly");
        list.add("eagle");
        list.add("20");
        list.add("shark");
        list.add("rose");
        list.add("100");

        List<String> alphabeticalSortedList = getAlphabeticalSortedList(list);
        System.out.println("Alphabetical sorted list: \n" +
                alphabeticalSortedList);

        List<String> startsEList = getListStartsE(list);
        System.out.println("List that starts with words that contain the letter 'e':\n "
                +startsEList);

        List<String> fourInsteadOfAList = getList4InsteadOfA(list);
        System.out.println("List with a 4 instead of an 'a' list: \n"+fourInsteadOfAList);

        List<String> numericList = getNumericList(list);
        System.out.println("List with numeric values: \n"+numericList);

    }

    public static List<String> getAlphabeticalSortedList(List<String> list){
        List<String> sortedList = new ArrayList<>(list);
        sortedList.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        return sortedList;
    }

    public static List<String> getListStartsE(List<String> list){
        List<String> listStartsE = list.stream().sorted(Comparator
                .comparing(s -> !s.contains("e"))).collect(Collectors.toList());
        return listStartsE;
    }

    public static List<String> getList4InsteadOfA(List<String> list){
        List<String> modifiedList = list.stream().map((s) -> s.replace("a", "4"))
                .collect(Collectors.toList());
        return modifiedList;
    }

    public static List<String> getNumericList(List<String> list){
        List<String> numericList = list.stream().filter((s) -> s.matches("\\d+"))
                .collect(Collectors.toList());
        return numericList;
    }
}
