package com.uroki2;

import java.util.Scanner;

public class Chisla1 {
    //Ввести с клавиатуры четыре числа, и вывести максимальное из них.
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите 1 число");
        int chislo1 = in.nextInt();
        System.out.println("Введите 2 число");
        int chislo2 = in.nextInt();
        System.out.println("Введите 3 число");
        int chislo3 = in.nextInt();
        System.out.println("Введите 4 число");
        int chislo4 = in.nextInt();
        if (chislo1>=chislo2&&chislo1>=chislo3&&chislo1>=chislo4){
            System.out.println("Максимальное число  "+ chislo1);
        }else if (chislo2>=chislo1&&chislo2>=chislo3&&chislo1>=chislo4){
            System.out.println("Максимальное число  "+ chislo2);
        }else if (chislo3>=chislo1&&chislo3>=chislo2&&chislo3>=chislo4){
            System.out.println("Максимальное число  "+ chislo3);
        } else {
            System.out.println("Максимальное число  "+ chislo4);
        }
    }
}
