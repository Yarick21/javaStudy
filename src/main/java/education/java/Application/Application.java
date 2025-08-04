package education.java.Application;

import java.util.function.Consumer;

class Application {

    public static void main(String... args) {
        //region main
        Consumer<String> out = str -> System.out.println(str); // Реализация функционального интерфейса Consumer<T>
        out.accept("Hello World");
        //endregion
    }
}
