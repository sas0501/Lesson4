package com.uroki5;

public class Dog {
    //Создать class Dog. У собаки должна быть кличка String name и возраст int age.
    //Создайте геттеры и сеттеры для всех переменных класса Dog.
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
