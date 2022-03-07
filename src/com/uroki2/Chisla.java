package com.uroki2;

import java.util.Scanner;

public class Chisla {
    //Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите 1 число");
        int chislo1 = in.nextInt();
        System.out.println("Введите 2 число");
        int chislo2 = in.nextInt();
        System.out.println("Минимальное число  "+ Math.min(chislo1,chislo2));
    }
}
