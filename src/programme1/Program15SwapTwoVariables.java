package programme1;

import java.util.Scanner;

public class Program15SwapTwoVariables {


    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("enter value A");
        int a = x.nextInt();


        System.out.println("enter value B ");
        int b = x.nextInt();

        System.out.println("Before Swapping");
        System.out.println(a);
        System.out.println(b);


        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping");
        System.out.println(a);
        System.out.println(b);


    }
}
