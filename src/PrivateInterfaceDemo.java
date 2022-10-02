interface PrivateInterfaceDemo {
    private void printString(){
        System.out.println("print method inside private method");
    }
    public static void display(){
        printMethod();
        System.out.println("display methods INSIDE static method");
    }
    public default void print1(){
        printString();
        System.out.println("printing default method");
    }
    private static void printMethod(){
        System.out.println("inside private static methods");
    }

}
class ProgramTest implements PrivateInterfaceDemo {
    public static void main(String[] args) {
        PrivateInterfaceDemo privateInterfaceDemo = new ProgramTest();
        PrivateInterfaceDemo.display();
        privateInterfaceDemo.print1();



    }
}