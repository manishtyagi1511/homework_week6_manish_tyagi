package programme1;

import java.util.Scanner;

public class Program8AreaOfTriangle {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter height");
        Double height = x.nextDouble();
        System.out.println("Enter base");
        Double base = x.nextDouble();
        Double triangle = height * base / 2;
        System.out.println("Area of triangle is " + triangle);

    }
}
