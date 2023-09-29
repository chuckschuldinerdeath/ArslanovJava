package ru.otus.murat.first.project;
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("введите цифру: ");
        int num = in.nextInt();

        if(num > 7){
            System.out.println("Привет, Вячеслав!");
        }
        else {
            System.out.println("Ваша цифра не больше 7");
        }
    }
}