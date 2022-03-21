package com.task;

/* 4. Массив из чисел в обратном порядке
1) Создать массив на 10 чисел.
2) Ввести с клавиатуры 10 чисел и записать их в массив.
3) Расположить элементы массива в обратном порядке.
4) Вывести результат на экран, каждое значение выводить с новой строки. */

import java.util.Scanner;

public class backwardIntArray {
    int[] array = new int[10];

    backwardIntArray () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи 10 строк в массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введи строку №" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println();

        for (int i = 0; i < (array.length / 2); i++) {
            int buffer;
            buffer = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = buffer;
        }

        System.out.println("Массив перетасован задом наперед");
        for (int i = 0; i < array.length; i++)
            System.out.println("Значение массива №" + (i + 1) + ": " + array[i]);
    }
}