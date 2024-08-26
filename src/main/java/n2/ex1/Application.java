package n2.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void testApp(){
        ArrayList<String> words = new ArrayList<>();

        words.add("Ana");
        words.add("Pedro");
        words.add("Carlos");
        words.add("Ara");
        words.add("Juan");
        words.add("Alejandro");

        List<String> modifiedList = getModifiedList(words);
        System.out.println(modifiedList);

    }
    public static List<String> getModifiedList(ArrayList<String> words){
        List<String> modifiedList =
                words.stream().filter(w -> w.charAt(0) == 'A' && w.length() == 3).collect(Collectors.toList());
        return modifiedList;
    }
}
