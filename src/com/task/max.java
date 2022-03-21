package com.task;

/* 1. Максимальное среди массива на 20 чисел
    1) В методе initializeArray():
    1.1) Создайте массив на 20 чисел
    1.2) Считайте с консоли 20 чисел и заполните ими массив
    2) Метод max(int[] array) должен находить максимальное число из элементов массива */

import java.util.Scanner;

public class max {

    int[] array = new int[5]; // Для задания нужно 20 значений, я упростил до 5

    public void initializeArray(int[] array) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Создан массив из 10 значений. Заполните его:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите значение " + (i + 1) + ": ");
            array[i] = scan.nextInt();
            this.array[i] = array[i];
        }
        System.out.println();
    }

    max (int[] array) {
        initializeArray(array);
        int max = this.array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];
        System.out.println("Максимальное значение: " + max);
        System.out.println();
    }
}