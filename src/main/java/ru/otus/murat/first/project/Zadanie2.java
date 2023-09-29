package ru.otus.murat.first.project;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("введите имя: ");
        String username = scan.nextLine();
        if (username.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}

