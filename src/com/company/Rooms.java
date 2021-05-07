package com.company;

public class Rooms {
    public double square;
    public String name;

    public Rooms(double square, String name)
    {
        this.square = square;
        this.name = name;
    }

    public Rooms()
    {

    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Комната - " +
                "площадь: " + square +
                ", имя комнаты: " + name;
    }
}
