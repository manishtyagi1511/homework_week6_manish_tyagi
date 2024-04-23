package programme1;

public class Program3Declare {
    /**
     * 3.1 Declare one instance and one static variable.
     * 3.2 Declare one instance method.
     * 3.3 Declare one static method.
     * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
     * 3.5 Declare the Main method.
     * 3.6 Call both instance and static methods into the Main method and run the programme.
     */

    int a = 30;
    static int b = 40;


    public static void main(String[] args) {
        method2();
        Program3Declare method8=new Program3Declare();
        method8.method();


    }

    public static void method2() {
     Program3Declare method6 = new Program3Declare();
        System.out.println(method6.a);
        System.out.println(b);


    }

    public void method() {
        System.out.println(a);// non static call or instance
        //Declare3 declare3 = new Declare3();
        System.out.println(Program3Declare.b); // static call


    }

}
