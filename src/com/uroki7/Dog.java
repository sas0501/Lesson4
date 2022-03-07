package com.uroki7;

public class Dog {
    //Создать класс Dog (собака) с тремя конструкторами:
    //- Имя
    //- Имя, рост
    //- Имя, рост, цвет
    private String name;
    private int height;
    private String color;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int height) {
        this.name = name;
        this.height = height;

    }

    public Dog(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

}

