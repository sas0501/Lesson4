package com.uroki6;

public class Rectangle {
    //Создать класс прямоугольник (Rectangle).
    //Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
    //Создать для него как можно больше методов initialize(…)
    //
    //Примеры:
    //- заданы 4 параметра: left, top, width, height
    //- ширина/высота не задана (оба равны 0)
    //- высота не задана (равно ширине) создаём квадрат
    //- создаём копию другого прямоугольника (он и передаётся в параметрах)
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize(int top, int left, int widht, int height) {
        this.top = top;
        this.left = left;
        this.width = widht;
        this.height = height;
    }
    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public void initialize(int top, int left, int widht) {
        this.top = top;
        this.left = left;
        this.width = widht;
        this.height = widht;
    }
    public void initialize(Rectangle rectangle) {
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }
    public void initialize(int top) {
        this.top = top;
        this.left = 10;
        this.width = 10;
        this.height = this.width;
    }


}

