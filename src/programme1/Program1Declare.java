package programme1;

public class Program1Declare {

    /**
     * 1.1 Declare two instance variables.
     * 1.2 Declare one instance method.
     * 1.3 Call both instance variables into the instance method inside the print statement.
     * 1.4 Declare the Main method.
     * 1.5 Call the above instance method into the Main method and Run the programme.
     */

    int a = 2;
    int b = 4;

    public static void main(String[] args) {

        Program1Declare p = new Program1Declare();
        System.out.println(p.a);
        System.out.println(p.b);

    }

    public void m1() {
        System.out.println(a);
        System.out.println(b);

    }

}
