package ru.stqa.pft.sandbox;

public class HelloWorld {
  public static void main(String[] args) {
    hello("world");                        //Вызов функции с определенным значением переменной
    hello("user");
    hello("Pavel");

    Square s = new Square(5);                     //Создание объекта заданного типа с значением параметра
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());  //Передаем объект и метод

    Rectangle r = new Rectangle(4, 6);         //Создание объекта заданного типа с значениями параметров
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());   //Передаем объект и атрибут
  }

  public static void hello(String somebody) {        //Название функции + выделение переменной (параметр или аргумент функции)
    System.out.println("Hello, " + somebody + "!");  //Использование переменной
  }

}