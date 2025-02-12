import java.util.*;

public class lesson1 {
    public Scanner sc;

    int x = 99;
    // String name = "Kei";

    // constructor
    public lesson1(){
        sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String nama =sc.nextLine();
        System.out.println("Welcome " + nama + num);


        // System.out.println(Math.cos(88));
        // System.out.println("Welcome " + name + x);
        // lesson1.Hello(); //static

        // lesson1 m = new lesson1(); // not static
        // m.Hello2();


    }

    // public void Hello2(){

    // }

    public static void Hello(){
        System.out.println("Static Function");
    }
    
    public static void main(String[] args) {
        // final String name = "Kei";
        // System.out.println("Hello World");
        // System.out.println("Hello " + name);
        // System.out.print("Enter your name: ");
        // Scanner input = new Scanner(System.in);
        // String name2 = input.nextLine();
        // System.out.println("Hello " + name2);
        // input.close();

        new lesson1(); // create object

    }
}