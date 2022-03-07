package com.uroki;

//    Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной
//    private String name равное переданному параметру String name.
class Cat {
    private String name;

    public void setName(String name) {
        //написать тут ваш код
        this.name = name;
    }
}
class Cat1
//    Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота), количество
//    котов увеличивалось на 1. За количество котов отвечает переменная catsCount.
{
    private static int catsCount = 0;
    public static void addNewCat()
    {
        //написать тут ваш код
        Cat1.catsCount++;
    }
}
class Cat2
//    Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать значение
//    переменной catsCount равное переданному параметру.
{
    private static int catsCount = 0;
    public static void setCatsCount(int catsCount)
    {
        //написать тут ваш код
        Cat2.catsCount=catsCount;
    }
}
class Cat3
//    Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной
//    private String fullName равное значению локальной переменной String fullName.
{
    private String fullName;
    public void setName(String firstName, String lastName)
    {
        String fullName = firstName + lastName;
        this.fullName=fullName;
        //написать тут ваш код
    }
}
