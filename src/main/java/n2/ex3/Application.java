package n2.ex3;

import n2.ex3.models.FunctionalInterface;

public class Application {

    public static void testApp(){
        FunctionalInterface addition = (a, b) -> (a + b);
        FunctionalInterface substraction = (a, b) -> (a - b);
        FunctionalInterface multiplication = (a, b) -> (a * b);
        FunctionalInterface division = (a, b) -> (a / b);

        float additionResult = addition.operation(20f , 10f);
        System.out.println(additionResult);

        float substractionResult = substraction.operation(20f , 10f);
        System.out.println(substractionResult);

        float multiplicationResult = multiplication.operation(20f , 10f);
        System.out.println(multiplicationResult);

        float divisionResult = division.operation(20f , 10f);
        System.out.println(divisionResult);

    }
}
