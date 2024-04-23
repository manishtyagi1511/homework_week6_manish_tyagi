package programme1;


import java.util.Scanner;

public class Program7Fahrenheit {

    public static void main(String[] args) {


        Scanner t =new Scanner(System.in);
        System.out.println("Enter temperature in Degree Fahrenheit");
        double f =t.nextDouble();
        double Celsius = (f-32)*5/9;
        System.out.println("Degree Fahrenheit Value converted into degree Celsius is " + Celsius);


    }
    }

