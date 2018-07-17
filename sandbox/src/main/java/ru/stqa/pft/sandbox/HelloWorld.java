package ru.stqa.pft.sandbox;

public class HelloWorld {
  public static void main(String[] args) {
    hello("world");                        //Вызов функции с определенным значением переменной
    hello("user");
    hello("Pavel");

    double l = 5;
    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
  }

  public static void hello(String somebody) {        //Название функции + выделение переменной (параметр или аргумент функции)
    System.out.println("Hello, " + somebody + "!");  //Использование переменной
  }

  public static double area(double len) {            //Функция с одним параметром
    return len * len;                                //Для возврата результата площади квадрата
  }

  public static double area(double a, double b) {    //Функция с двумя параметрами
    return a * b;                                    //Для возврата результата площади прямоугольника
  }
}