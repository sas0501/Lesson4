package com.uroki4;

import java.util.Scanner;

public class ChislaWhile7 {
    //Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
    //
    //Пример:
    //8
    //88
    //888
    //...
    public static void main(String[] args) {
        StringBuilder stroka = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                stroka.append("8");
            }
            stroka.append(System.lineSeparator());
        }
        System.out.println(stroka);
    }
}