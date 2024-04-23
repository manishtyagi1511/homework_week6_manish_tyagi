package programme1;

import java.util.Scanner;

public class Program6RadiusValue {

    public static void main(String[] args) {
        double pi=3.14;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Radius Value");
        double r = s.nextDouble();
        double Area=pi*r*r;
        System.out.println("Area of Circle is =" +Area);


    }
}
