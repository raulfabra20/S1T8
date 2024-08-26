package n2.ex2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Application {

    public static void testApp(){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(43);
        numbers.add(8);
        numbers.add(11);
        numbers.add(22);
        numbers.add(20);

        String textChain = getTextChain(numbers);
        System.out.println(textChain);

    }
    public static String getTextChain(ArrayList<Integer> numbers){
        String textChain = numbers.stream().map(num -> (num % 2 == 0 ? "e" : "o") + num)
                .collect(Collectors.joining(", "));
        return textChain;
    }
}
