package com.uroki;

public class Cat4 {
    //Написать код, который бы подсчитывал количество созданных котов (count) и на экран выдавалось правильно их количество.
    private static int count;
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //написать тут ваш код
        Cat4.count++;
        Cat cat2 = new Cat();
        //написать тут ваш код
        Cat4.count++;
        System.out.println("Cats count is " + Cat4.count);
    }
}