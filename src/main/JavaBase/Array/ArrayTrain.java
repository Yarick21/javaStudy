package main.JavaBase.Array;

import java.math.BigDecimal;
import java.util.Scanner;

public class ArrayTrain {
    public static void main(String[] args) {
        double[] input = { 1, 5.2, 4, 0, -1 };

        System.out.println(sumNumber(input));
    }

    /*
    Напишите функцию, которая принимает массив слов, объединяет их в предложение и возвращает это предложение.
    Вы можете игнорировать необходимость очистки слов или добавления знаков препинания, но вам следует добавлять
     пробелы между каждым словом. Будьте внимательны: ни в начале, ни в конце предложения не должно быть пробела!
     ["hello", "world", "this", "is", "great"]  =>  'hello world this is great'
    */
    static String sentenceSmash(String[] words) {
        String resultString = "";

        for (String word: words) {
            resultString += word + " ";
        }

        return resultString.strip();
    }

    /*
    Напишите функцию, которая принимает массив чисел и возвращает сумму чисел.
    Числа могут быть отрицательными или не целыми. Если массив не содержит чисел, вам следует вернуть 0.
    Examples
    Input: [1, 5.2, 4, 0, -1]
    Output: 9.2
    */

    static double sumNumber(double ...numbers) {
        double result = 0;

        if (numbers.length == 0) {
            return 0;
        } else {
            for (double num: numbers) {
                result += num;
            }
        }
        return result;
    }
}
