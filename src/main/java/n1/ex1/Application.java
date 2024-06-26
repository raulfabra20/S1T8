package n1.ex1;

import java.util.*;
import java.util.stream.Collectors;

public class Application {

    public static void testApp(){
        ArrayList<String> wordsList = new ArrayList();
        addWords(wordsList);
        List<String> listWordsContainsO = createListContainsO(wordsList);
        printListContainsO(listWordsContainsO);
    }

    public static void addWords(ArrayList<String> wordsList) {
        wordsList.add("computer");
        wordsList.add("screen");
        wordsList.add("phone");
        wordsList.add("lights");
        wordsList.add("whiteboard");
        wordsList.add("desk");
    }
    public static List<String> createListContainsO(ArrayList<String> wordsList){
        List<String> listWordsContainsO = wordsList.stream()
                .filter(word -> word.contains("o"))
                .collect(Collectors.toList());

       return listWordsContainsO;
    }

    public static void printListContainsO(List<String> listWordsContainsO){
        listWordsContainsO.forEach(System.out::println);
    }

}
