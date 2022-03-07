package com.uroki3;

public class ChislaWhile4 {
    //Вывести на экран таблицу умножения 10х10 используя цикл while.
    //Числа разделить пробелом.
    //
    //Example output:
    //1	2	3	4	5	6	7	8	9	10
    //2	4	6	8	10	12	14	16	18	20
    //3	6	9	12	15	18	21	24	27	30
    //...
    public static void main(String[] args) {
        int i = 1;
        while (i < 11){
            int j=1;
            while (j < 11){
                System.out.printf("%4d",j*i);
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
