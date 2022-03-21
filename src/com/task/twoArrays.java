package com.task;

/* 3. 2 массива
1) Создать массив на 10 строк.
2) Создать массив на 10 чисел.
3) Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4) В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки. */

import java.util.Scanner;

public class twoArrays {
    String[] strings = new String[10];
    int[] index = new int[10];

    twoArrays () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи 10 строк в массив");
        for (int i = 0; i < strings.length; i++) {
            System.out.print("Введи строку №" + (i + 1) + ": ");
            strings[i] = scan.nextLine();
            if (strings[i].length() == i + 1)
                index[i] = strings[i].length();
        }
        System.out.println();
    }

    public void getIndexArray() {
        System.out.println("Массив должен хранить размер значений номера массива. Давай проверим его?");
        for (int i = 0; i < index.length; i++) {
            System.out.print("Значение массива с индексом " + (i + 1));
            if (index[i] != 0)
                System.out.println(" равно: " + index[i]);
            else System.out.println(" не внесено");
        }
        System.out.println();
    }
}
