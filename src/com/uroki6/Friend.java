package com.uroki6;

public class Friend {
    //Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
    //- Имя
    //- Имя, возраст
    //- Имя, возраст, пол
    private String name;
    private int age;
    private String sex;

    public void initialize(String name) {
        this.name = name;
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public void initialize(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

}

