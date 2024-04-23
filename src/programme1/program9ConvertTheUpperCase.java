package programme1;

import java.util.Scanner;

public class program9ConvertTheUpperCase {


    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter the upper case");
        String up = x.nextLine();
        String lc= up.toLowerCase();
        System.out.println("lower case "+lc);

    }
}
