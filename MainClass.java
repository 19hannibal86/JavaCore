
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the age please: ");
        int age = scan.nextInt();

        System.out.println();

        System.out.print("Enter the name please: ");
        String name = scan.next();

        Student student1 = new Student(name, age);

        System.out.println("Name " + student1.getName());

        System.out.println("Age " + student1.getAge());

        System.out.println(student1.getName());
        System.out.println(student1.name);

        student1.doSomeStuff();
    }

}