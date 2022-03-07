package com.uroki7;

public class Circle {
    //Создать класс (Circle) круг, с тремя конструкторами:
    //- centerX, centerY, radius
    //- centerX, centerY, radius, width
    //- centerX, centerY, radius, width, color
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;

    public Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius,int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public Circle(int centerX, int centerY, int radius,int width,String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color=color;
    }

}

