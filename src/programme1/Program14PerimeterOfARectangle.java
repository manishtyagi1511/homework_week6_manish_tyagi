package programme1;

import java.util.Scanner;

public class Program14PerimeterOfARectangle {


    public static void main(String[] args) {




        Scanner x =new Scanner(System.in);
        System.out.println("Enter width");
        float width = x.nextFloat();
        System.out.println("Enter height");
        float height = x.nextFloat();
        float area = height*width;
        System.out.println("Area is " + width+  "*"  +height+ "=" +area);
        float perimeter = 2* (width+height);
        //System.out.println("Perimeter is 2 * +"(" +width  + height ")"+"=" + perimeter);

            System.out.println("Perimeter is 2 *" + "("+width+ "+" +height+")"+ "=" +perimeter);

          //      System.out.println("Perimeter is 2 * "+"(" +width " + "+ height ")"+ "=" +perimeter);






    }
}
