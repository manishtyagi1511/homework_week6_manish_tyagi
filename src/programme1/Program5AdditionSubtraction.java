package programme1;

import java.util.Scanner;

public class Program5AdditionSubtraction {


    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Enter first number ");
        int a =x.nextInt();
        System.out.println("Enter second number ");
        int b =x.nextInt();
        addition(a,b);
        subtraction(a,b);

        Program5AdditionSubtraction obj = new Program5AdditionSubtraction();
        obj.division(a,b);
        obj.multiplication(a,b);

    }


    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void subtraction(int a, int b) {
        int result = a - b;
        System.out.println(result);

    }

    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println(result);

    }

    public void division(int a, int b) {
        int result = a/b;
        System.out.println(result);

    }




        }

