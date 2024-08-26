package n3;

import n3.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void testApp(){
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Rosa", 40, "Python", 7.0));
        studentList.add(new Student("Marta", 34, "Java", 5.5));
        studentList.add(new Student("Alberto", 36, "PHP", 4.0));
        studentList.add(new Student("Laura", 29, "PHP", 7.5));
        studentList.add(new Student("Victor", 18, "Python", 6.0));
        studentList.add(new Student("Antonio", 48, "PHP", 3.5));
        studentList.add(new Student("Edith", 15, "Java", 6.0));
        studentList.add(new Student("Christian", 27, "Java", 3.0));
        studentList.add(new Student("Imma", 19, "Python", 8.0));
        studentList.add(new Student("Cristina", 32, "Java", 7.0));

        System.out.println("List showing names and ages:");
        printNameAndAge(studentList);

        System.out.println("List showing student's name that starts with letter 'A': ");
        List<Student> studentsStartAList = getStudentsStartA(studentList);
        System.out.println(studentsStartAList);

        System.out.println("List showing students that has passed: ");
        printStudentsPassed(studentList);

        System.out.println("List showing students that has passed and are not doing PHP: ");
        printStudentsPassedAndNotPhp(studentList);

        System.out.println("List showing students older or with 18 years old and currently doing Java: ");
        printJavaStudentsOldEighteen(studentList);
    }

    public static void printNameAndAge(List<Student> studentList){
        studentList.forEach(s -> System.out.println(s.getName()+", "+ s.getAge()));
    }

    public static List<Student> getStudentsStartA(List<Student> studentList){
        List<Student> studentsStartAList = studentList.stream().filter(s -> s.getName().startsWith("A"))
                .collect(Collectors.toList());
        return studentsStartAList;
    }

    public static void printStudentsPassed(List<Student> studentList){
        studentList.stream().filter(s -> s.getGrade() >= 5.0).forEach(System.out::println);
    }

    public static void printStudentsPassedAndNotPhp(List<Student> studentList){
        studentList.stream().filter(s -> s.getGrade() >= 5.0 && !s.getCourse().matches("PHP"))
                .forEach(System.out::println);
    }

    public static void printJavaStudentsOldEighteen(List<Student> studentList){
        studentList.stream().filter(s -> s.getAge() >= 18 && s.getCourse().matches("Java"))
                .forEach(System.out::println);
    }
}
