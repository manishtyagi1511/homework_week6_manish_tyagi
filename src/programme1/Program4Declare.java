package programme1;

public class Program4Declare {
    /**
     * 4.1 Declare two instance and two static variables.
     * 4.2 Declare one instance method.
     * 4.3 Declare one static method.
     * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
     * 4.5 Declare the Main method.
     * 4.6 Call both instance and static methods into the Main method and run the programme.
     */

    int a=10;
    int b=20;

    static int c=30;
    static int d=40;

    public static void main(String[] args) {
        Program4Declare obj=new Program4Declare();
        System.out.println(obj.a); //Calling instance variable
        Program4Declare obj1 = new Program4Declare();
        System.out.println(obj1.b); //Calling instance variable
        System.out.println(c);
        System.out.println(d);


    }
    public void range(){
        System.out.println(a); //Calling instance variable
        System.out.println(b); //Calling instance variable
        System.out.println(Program4Declare.c);// Calling Static variable
        System.out.println(Program4Declare.d); //Calling Static variable

    }


}
