package education.java.Application;

import education.java.base.Array.ArrayTrain;
import education.java.base.HelloWord.HelloWorld;

class Application {
    public static void main(String... args) {
        HelloWorld obj = new HelloWorld();

        System.out.println(ArrayTrain.test()); // Вызов static метода, без экземпляра класса
        System.out.println(obj.returnHelloWord()); // Вызов метода через экземпляр класса
    }
}
