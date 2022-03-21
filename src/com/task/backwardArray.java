package com.task;

/* 2. Массив из строчек в обратном порядке
1) Создать массив на 10 строчек.
2) Ввести с клавиатуры 8 строчек и сохранить их в массив.
3) Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки. */

import java.util.Scanner;

public class backwardArray {
    String[] strings = new String[10];

    public void printArrayBackward() {
        System.out.println("Массив из текстовых значений следующий");
        for (int i = (strings.length - 1); i >= 0; i--)
            System.out.println("Значение " + (i + 1) + " - " + strings[i]);
        System.out.println();
    }

    backwardArray (String[] s) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Создан массив из 10 значений. Заполните его:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Введите значение " + (i + 1) + ": ");
            s[i] = scan.nextLine();
            strings[i] = s[i];
        }
        System.out.println();
        printArrayBackward();
    }
}
