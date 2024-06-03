package main.JavaBase.DataTypes;

public class BaseTypes {

    public static void main(String[] args) {

        System.out.println(operationsWithBasedTypes());
    }

    public static String operationsWithBasedTypes() {

        int age = 21;
        String name = "Slava";

        return "Slava is %d years old".formatted(age);
    }
}
