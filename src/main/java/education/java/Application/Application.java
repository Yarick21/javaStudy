package education.java.Application;

import education.java.base.HelloWord.HelloWorld;

class Application {
    public static void main(String... args) {
        HelloWorld obj = new HelloWorld();
        System.out.println(obj.returnHelloWord());
    }
}
