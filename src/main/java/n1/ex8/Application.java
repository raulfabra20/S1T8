package n1.ex8;

import n1.ex8.models.ReverseWord;

public class Application {
    public static void testApp(){

        //Method body
        ReverseWord reverseWord = (word) -> new StringBuilder(word).reverse().toString();

        // Call method:
        System.out.println(reverseWord.reverse("computer"));


    }
}
