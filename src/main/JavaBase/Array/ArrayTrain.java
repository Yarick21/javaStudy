package main.JavaBase.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayTrain {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(
                countPositivesSumNegatives(digits)
        );
    }

    public static String test() {
        return "test";
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

/*
Рассмотрим массив/список овец, в котором некоторые овцы могут отсутствовать на своем месте.
Нам нужна функция, которая подсчитывает количество овец, присутствующих в массиве (истина означает наличие).
*/

    static int sumSheeps(boolean[] sheeps) {
        int result = 0;

        for(int i = 0; i < sheeps.length; i++) {
            if (sheeps[i]) {
                result += 1;
            }
        }
        System.out.println("Количество овец = " + result);

        return result;
    }

    /**
     * Учитывая массив целых чисел, ваше решение должно найти наименьшее целое число.
     * Например: Учитывая [34, 15, 88, 2], ваше решение вернет 2 Учитывая [34, -345, -1, 100], ваше решение вернет -345.
     * Для целей этого ката вы можете предположить, что предоставленный массив не будет пустым.
     * */

    static int minDigit(int[] digits) {
        int min = digits[0];

//        for(int digit: digits) {
//            if(digit < min) {
//                min = digit;
//            }
//        }
        for(int i = 0; i < digits.length; i++) {
            if(digits[i] < min) {
                min = digits[i];
            }
        }
        return min;
    }

    /**
     * Дан массив целых чисел. Возвращает массив, где первый элемент — это количество положительных чисел, а второй элемент — сумма отрицательных чисел.
     * 0 не является ни положительным, ни отрицательным. Если входные данные представляют собой пустой массив или имеют значение NULL, верните пустой массив.
     * Пример Для ввода [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15] вы должны вернуть [10, -65].
     */

    public static int[] countPositivesSumNegatives(int[] input) {
        int positiveDigit = 0;
        int sumOfnegativeDigit = 0;

        if((input.length == 0) || (Arrays.asList(input).contains(null))) {
            return input;
        } else {
            for(int digit: input) {
                if(digit == 0) {
                    continue;
                } else if (digit < 0) {
                    sumOfnegativeDigit += digit;
                } else if (digit > 0) {
                    positiveDigit++;
                }
            }
            int[] result = new int[] {positiveDigit, sumOfnegativeDigit};
//            System.out.println(Arrays.toString(result));
            return result;
        }
    }
}
