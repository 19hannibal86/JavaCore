import java.util.Scanner;

public class Student {

    private int age;
    public String name;

    public Student(String name ,int age) {
        this.age = age;
        this.name = name;
    }


    public void doSomeStuff(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer please: ");
        int x = scan.nextInt();

        System.out.println();

        System.out.print("Enter an boolean please: ");
        boolean y = scan.nextBoolean();

        System.out.println();

        System.out.print("Enter an double please: ");
        double z = scan.nextDouble();

        System.out.println("X = " +x);
        System.out.println("Y = " +y);
        System.out.println("Z = " +z);
    }

     public int getAge(){

        return age;
     }

     public void setAge(int age){

        this.age = age;
     }



    public String getName(){

        return name;
    }






}