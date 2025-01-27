package example;

public class Example {

    public static void main(String[] args) {
        System.out.println("Hello from Example!");
        methodOne();
        methodTwo();
    }

    static void methodOne() {}

    static void methodTwo() {
        nestedMethod();
    }

    static void nestedMethod() {}
}
