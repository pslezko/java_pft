package ru.stqa.pft.sandbox;

public class Rectangle {
  public double a;     //Одна сторона прямоугольника
  public double b;     //Вторая сторона прямоугольника

  public Rectangle(double a, double b) {  //Конструктор с параметрами
    this.a = a;
    this.b = b;
  }

  public double area() {
    return this.a * this.b;
  }

}