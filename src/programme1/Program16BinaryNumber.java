package programme1;
import java.util.Scanner;

public class Program16BinaryNumber {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("first and second binary number");

        String d = x.nextLine();
        String d1 = x.nextLine();

        int number1 = Integer.parseInt(d, 2);
        int number2 = Integer.parseInt(d1, 2);

        int output = number1 + number2;

        System.out.println(Integer.toBinaryString(output));



    }
}
