package com.uroki4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ChislaWhile9 {
    //Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
    //
    //Пример текста:
    //Света любит меня.
    //Света любит меня.
    //…
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = in.nextLine();
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " любит меня.");
        }
    }
}