package com.task;

/* 5. Один большой массив и два маленьких
1) Создать массив на 20 чисел.
2) Ввести в него значения с клавиатуры.
3) Создать два массива на 10 чисел каждый.
4) Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5) Вывести второй маленький массив на экран, каждое значение выводить с новой строки. */

import java.util.Scanner;

public class oneLargeArrayTwoSmall {
    int[] bigArray = new int[20];

    oneLargeArrayTwoSmall () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Массив на 20 значений инициализирован, давай заполним его.");
        for (int i = 0; i < bigArray.length; i++) {
            System.out.print("Введи строку №" + (i + 1) + ": ");
            bigArray[i] = scanner.nextInt();
        }
        System.out.println();

        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];
        for (int i = 0; i < 10; i++) {
            smallArray1[i] = bigArray[i];
        }
        for (int i = 10; i < 20; i++) {
            smallArray2[i-10] = bigArray[i];
        }

        System.out.println("Большой массив скопирован в 2 массива поменьше.");
        System.out.println("Вот значения во втором малом массиве:");
        for (int i = 0; i < smallArray2.length; i++)
            System.out.println("Значение №" + (i + 1) + " малого массива = " + smallArray2[i]);
    }
}
