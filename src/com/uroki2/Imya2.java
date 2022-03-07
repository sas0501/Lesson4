package com.uroki2;

import java.util.Scanner;

public class Imya2 {
    //Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String imya1 = in.nextLine();
        System.out.println("Введите возраст");
        int vozrast = in.nextInt();

        if (vozrast<18) {
            System.out.println(imya1+" подрасти ещё");
        }
    }
}
