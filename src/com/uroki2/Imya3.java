package com.uroki2;

import java.util.Scanner;

public class Imya3 {
    //Ввести с клавиатуры имя и возраст.
    //Если возраст больше 20 вывести надпись «И 18-ти достаточно»
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String imya1 = in.nextLine();
        System.out.println("Введите возраст");
        int vozrast = in.nextInt();

        if (vozrast>20) {
            System.out.println(imya1+" и 18-ти достаточно");
        }
    }

}
