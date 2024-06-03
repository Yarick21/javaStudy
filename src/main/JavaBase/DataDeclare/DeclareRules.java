package main.JavaBase.DataDeclare;

public class DeclareRules {

    public static void main(String[] args) {
        System.out.println(declareParam());
    }

    public static int declareParam() {

        int firstParam = 1;
        var secondParam = 2;
        final int THIRD_PARAM = 3;

        return firstParam + secondParam + THIRD_PARAM;
    }

}
