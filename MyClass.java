public class MyClass {
    private int privateField1;
    private String privateField2;

    private void privateMethod() {
        System.out.println("Inside privateMethod()");
        System.out.println("Private Field 1: " + privateField1);
        System.out.println("Private Field 2: " + privateField2);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.privateField1 = 10;
        obj.privateField2 = "Hello";

        System.out.println("Printing private fields from main method:");
        System.out.println("Private Field 1: " + obj.privateField1);
        System.out.println("Private Field 2: " + obj.privateField2);

        obj.privateMethod();
    }
}