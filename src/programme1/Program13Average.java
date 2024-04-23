package programme1;

import java.util.Scanner;

public class Program13Average {


    public static void main(String[] args) {


        Scanner x = new Scanner(System.in);
        System.out.println("Enter first number");
        Double first = x.nextDouble();

        System.out.println("Enter second number");
        Double second = x.nextDouble();

        System.out.println("Enter three number");
        Double third = x.nextDouble();

        Double average = (first+second+third)/3;
        System.out.println("The average of three numbers are "+ average);


    }
}
