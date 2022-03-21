package com.task;

public class Main {

    public static void main(String[] args) {
        // Вывод задания №1
        int[] array = new int[5];
        max Task1 = new max(array);

        // Вывод задания №2
        String[] s = new String[10];
        backwardArray Task2 = new backwardArray(s);

        // Вывод задания №3
        twoArrays Task3 = new twoArrays();
        Task3.getIndexArray();

        // Вывод задания №4
        backwardIntArray Task4 = new backwardIntArray();

        // Вывод задания №5
        oneLargeArrayTwoSmall Task5 = new oneLargeArrayTwoSmall();
    }
}
