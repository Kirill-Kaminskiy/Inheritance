package com.company;

import javax.swing.*;

public class BigCar extends Cars {
    public double capacity;

    public BigCar(String name, String color, int cost, int size, String brand, double capacity) {
        super(name, color, cost, size, brand);
        this.capacity = capacity;
        this.cost = getCostWithBrand();
    }

    public BigCar() {
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public int KategoryofCost() {
        if (capacity <= 10)
        {
            JOptionPane.showMessageDialog(null, "Это грузовая машина 1 категории");
        }
        else if (capacity <= 20)
        {
            JOptionPane.showMessageDialog(null, "Это грузовая машина 2 категории");
        }

        else if (capacity <= 30)
        {
            JOptionPane.showMessageDialog(null, "Это грузовая машина 3 категории");
        }
        return 0;
    }

    public int getCostWithBrand()
    {
        if (brand.equalsIgnoreCase("Mazda"))
        {
            cost = (int) ((int) 4 + Math.random() * 8);
        }
        else if(brand.equalsIgnoreCase("Iveco"))
        {
            cost = (int) ((int) 8 + Math.random() * 10);
        }
        else if(brand.equalsIgnoreCase("Reno"))
        {
            cost = (int) ((int) 10 + Math.random() * 12);
            System.out.println();
        }
        return 0;
    }

    public int getMoreCostColor()
    {
        String str = JOptionPane.showInputDialog(null, "Введите цвет покраски(зелёный, красный, синий)");

        if (str.equalsIgnoreCase("зелёный"))
        {
            JOptionPane.showMessageDialog(null, "Зелёный матовый! Неплохо. Тогда +2 к стоимости");
            setCost(+2);
        }
        else if (str.equalsIgnoreCase("красный"))
        {
            JOptionPane.showMessageDialog(null, "Красный хром! Классно. Тогда +4 к стоимости");
            setCost(+4);
        }
        else if (str.equalsIgnoreCase("cиний"))
        {
            JOptionPane.showMessageDialog(null, "Синий металик! Круто. Тогда +6 к стоимости");
            setCost(+6);
        }
        return 0;
    }

}
