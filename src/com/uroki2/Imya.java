package com.uroki2;

import java.util.Scanner;

public class Imya {
    //Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
    //Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 Имя");
        String imya1 = in.nextLine();
        System.out.println("Введите 2 Имя");
        String imya2 = in.nextLine();
        if (imya1.equals(imya2)) {
            System.out.println("Имена идентичны");
        } else if (!imya1.equals(imya2) && imya1.length() == imya2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
