package com.uroki5;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        //В методе main создать три объекта типа Cat и заполнить их данными.
        //Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
        Cat cat1=new Cat();
        Cat cat2=new Cat();
        Cat cat3=new Cat();

        cat1.name="Васька";
        cat2.name="Рыжик";
        cat3.name="Барсик";

        cat1.age=1;
        cat2.age=10;
        cat3.age=2;

        cat1.weight=2;
        cat2.weight=10;
        cat3.weight=4;

        cat1.strength=7;
        cat2.strength=50;
        cat3.strength=8;

        System.out.println(cat1.name+" "+cat1.age+" "+cat1.weight+" "+cat1.strength);
        System.out.println(cat2.name+" "+cat2.age+" "+cat2.weight+" "+cat2.strength);
        System.out.println(cat3.name+" "+cat3.age+" "+cat3.weight+" "+cat3.strength);

        //Создать три кота используя класс Cat.
        //Провести три боя попарно между котами.
        //Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
        //Результат каждого боя вывести на экран.
        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));

    }
}
