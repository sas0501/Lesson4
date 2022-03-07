package com.uroki4;

import java.util.Scanner;

public class ChislaWhile6 {
    //Ввести с клавиатуры два числа m и n.
    //Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
    //
    //Пример: m=2, n=4
    //8888
    //8888
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int m = in.nextInt();
        System.out.println("Введите 2 число");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}