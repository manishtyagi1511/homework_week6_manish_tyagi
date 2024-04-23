package programme1;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Program19LowerCase {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

       String abc ="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";

      // System.out.println("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");


        System.out.println("write in upper case");
        String lo = x.nextLine();

        String up = lo.toLowerCase();
        System.out.println("lower case is :" + up);

    }
}
