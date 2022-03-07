package com.uroki7;

public class Friend {
    //Создать класс Friend (друг) с тремя конструкторами:
    //- Имя
    //- Имя, возраст
    //- Имя, возраст, пол
    private String name;
    private int age;
    private String sex;

    public Friend(String name) {
        this.name = name;
    }
    public Friend(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public Friend(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

}

