package n1.ex4;

import java.util.ArrayList;

public class Application {
    public static void testApp(){
        ArrayList<String> months = new ArrayList();
        addMonths(months);

        //Print the list using method reference:
        months.forEach(System.out::println);

    }

    public static void addMonths(ArrayList<String> months){
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

    }

}
