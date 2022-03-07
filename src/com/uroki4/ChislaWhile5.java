package com.uroki4;

public class ChislaWhile5 {
    //Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
    //Через пробел либо с новой строки.
    public static void main(String[] args) {
        for (int x = 1; x <= 100; x++) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
                x++;
            }
        }
    }
}