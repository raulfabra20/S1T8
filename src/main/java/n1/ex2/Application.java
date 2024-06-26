package n1.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void testApp(){
        ArrayList<String> wordsList = new ArrayList();
        addWords(wordsList);
        List<String> modifiedList = createModifiedList(wordsList);
        printModifiedList(modifiedList);
    }

    public static void addWords(ArrayList<String> wordsList) {
        wordsList.add("computer");
        wordsList.add("screen");
        wordsList.add("phone");
        wordsList.add("lights");
        wordsList.add("whiteboard");
        wordsList.add("desk");
        wordsList.add("bottle");
    }
    public static List<String> createModifiedList(ArrayList<String> wordsList){
        return wordsList.stream()
                .filter(word -> word.contains("o") && word.length()>=6)
                .collect(Collectors.toList());
    }

    public static void printModifiedList(List<String> listWordsContainsO){
        listWordsContainsO.forEach(System.out::println);
    }

}
