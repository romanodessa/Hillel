import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

         /* Задача “Случайные числа”

        Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
        Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.*/

        int array2[] = new int[8];
        int firstNumber = 1;
        int lastNumber = 10;

        for (int i = 0; i < array2.length; i++) {
            array2[i] = firstNumber + (int) (Math.random() * lastNumber);
            System.out.print(array2[i] + " ");
        }

        for (int i = 0; i < array2.length; i = i + 2) {
            array2[i] = 0;
        }

        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        /* Задача 1)
        Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем
       этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1)*/

        int size = ((99-1)/2) + 1;
        Integer array1[] = new Integer[size];

        int a = 1;
        System.out.println();

        for (int i = 0;  i< array1.length; i++) {
            array1[i] = a;
            a = a + 2;
            System.out.print(array1[i] + " ");
        }

        Arrays.sort(array1, Collections.reverseOrder());
        System.out.println();

        for (int i = 0;  i< array1.length; i++){
            System.out.print(array1[i] + " ");
        }

        System.out.println();




    }
}
