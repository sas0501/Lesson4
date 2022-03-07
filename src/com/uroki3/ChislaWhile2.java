package com.uroki3;

import java.util.Scanner;

public class ChislaWhile2 {
    //Ввести с клавиатуры строку и число N.
    //Вывести на экран строку N раз, используя цикл while.
    //
    //Пример ввода:
    //абв
    //2
    //Пример вывода:
    //абв
    //абв
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String stroka = in.nextLine();
        System.out.println("Введите число");
        int chislo = in.nextInt();
        int i=1;
        while(i<=chislo){
            System.out.println(stroka +"  "+i);
            i++;
        }
    }
}
