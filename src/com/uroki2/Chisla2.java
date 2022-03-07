package com.uroki2;

import java.util.Arrays;
import java.util.Scanner;

public class Chisla2 {
    //Ввести с клавиатуры три числа, и вывести их в порядке убывания..

    public static void main(String[] args) {
        int[] arr = new int [3];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 число");
        arr[0]= in.nextInt();
        System.out.println("Введите 2 число");
        arr[1] = in.nextInt();
        System.out.println("Введите 3 число");
        arr[2] = in.nextInt();

        sortReverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
    }
    public static void sortReverse(int[] arr) {
        int tmp;
        boolean is_swap;
        for (int i = arr.length - 1; i >= 1; i--) {
            is_swap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                    is_swap = true;
                }
            }
            // Если перестановок не было, то выходим
            if (is_swap == false) break;
        }
    }
}

