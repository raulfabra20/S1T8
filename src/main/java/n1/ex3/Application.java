package n1.ex3;

import java.util.ArrayList;

public class Application {
    public static void testApp(){
        ArrayList<String> months = new ArrayList();
        addMonths(months);
        printMonths(months);

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
    public static void printMonths(ArrayList<String> months){
        months.forEach( (m) -> {
           System.out.println(m); } );

    }
}
