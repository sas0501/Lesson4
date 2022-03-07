package com.uroki4;

public class ChislaWhile8 {
    //Используя цикл for вывести на экран:
    //- горизонтальную линию из 10 восьмёрок
    //- вертикальную линию из 10 восьмёрок.
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(8);
        }
        System.out.println(System.lineSeparator());
        for (int i = 1; i <= 10; i++) {
            System.out.println(8);
        }
    }
}