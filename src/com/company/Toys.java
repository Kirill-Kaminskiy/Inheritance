package com.company;

import javax.swing.*;

public class Toys {
    public String name;
    public String color;
    public int cost;

    public Toys(String name, String color, int cost) {
        this.name = name;
        this.color = color;
        this.setCost(cost);
    }

    @Override
    public String toString() {
        return "Игрушки" +
                "Наименование: " + name + '\'' +
                "Цвет: " + color + '\'' +
                "Стоимость: " + cost;
    }

    public  Toys()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    // Сортировка по стоимости продукции
    public static void bubbleSort(Toys[] array) {
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].getCost() > array[i+1].getCost()) {

                    Toys temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public int KategoryofCost() throws InterruptedException {
        if (cost <= 4)
        {
            JOptionPane.showMessageDialog(null, "Это игрушка дешёвая!");
        }

        if (cost <= 8)
        {
            JOptionPane.showMessageDialog(null, "Это игрушка не оверпрайс, но и не дешёвая!");
        }

        if (cost <= 12)
        {
            JOptionPane.showMessageDialog(null, "Это игрушка дорогая!");
        }
        return 0;
    }
}
