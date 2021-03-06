package com.uroki6;

public class Cat {
    //Создать класс Cat (кот) с пятью инициализаторами:
    //- Имя
    //- Имя, вес, возраст
    //- Имя, возраст (вес стандартный)
    //- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
    //- вес, цвет, адрес (чужой домашний кот)
    //
    //Задача инициализатора – сделать объект валидным. Например, если вес неизвестен,
    //то нужно указать какой-нибудь средний вес.
    //Кот не может ничего не весить. То же касательно возраста.
    //А вот имени может и не быть (null). То же касается адреса: null.
    private String name = null;
    private int weight;
    private int age;
    private String color = null;
    private String address = null;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void initialize(int age, String name, int weight) {
        this.name = name;
        this.age = age;
        this.weight = 1;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = null;
        this.age = 0;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

}

