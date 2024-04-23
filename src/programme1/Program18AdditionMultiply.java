package programme1;

import java.util.Scanner;

public class Program18AdditionMultiply {


    public static void main(String[] args) {

        Scanner x =new Scanner(System.in);
        System.out.println("enter first number");
        int first =x.nextInt();
        System.out.println("enter second number");
        int second=x.nextInt();

        System.out.println(first+ "+" +second+ "=" + (first+second));
        System.out.println(first+ "-" +second+ "=" + (first-second));
        System.out.println(first+ "*" +second+ "=" + (first*second));
        System.out.println(first+ "/" +second+ "=" + (first/second));
        System.out.println(first+ "mod" +second+ "=" + (first%second));








    }
}
