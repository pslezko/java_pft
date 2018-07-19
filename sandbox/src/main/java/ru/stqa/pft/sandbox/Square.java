package ru.stqa.pft.sandbox;

public class Square {
  public double l;                 //Длина стороны квадрата

  public Square(double l) {        //Конструктор с параметром
    this.l = l;
  }

  public double area() {
    return this.l * this.l;
  }

}