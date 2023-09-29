package ru.otus.murat.first.project;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        int[] array = {2, 3, 5, 8, 10, 11, 14, 15, 18, 20};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println("Номер: " + array[i]);
            }
        }
    }
}
