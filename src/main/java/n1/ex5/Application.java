package n1.ex5;

import n1.ex5.models.Pi;

public class Application   {

    public static void testApp(){

        Pi piValue = () -> 3.1415;

        System.out.println(piValue.getPiValue());

    }

}
