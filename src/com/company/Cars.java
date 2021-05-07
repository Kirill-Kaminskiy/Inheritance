package com.company;

import javax.swing.*;

public class Cars extends Toys {
    public int size;
    public String brand;

    public Cars(String name, String color, int cost, int size, String brand)
    {
        super(name, color, cost);
        this.size = size;
        this.brand = brand;
    }

    public Cars()
    {

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int KategoryofCost() throws InterruptedException {
        if (size <= 10)
        {
            JOptionPane.showMessageDialog(null, "Машина маленькая!");
        }

        else if (size <= 20)
        {
            JOptionPane.showMessageDialog(null, "Машина средняя!");
        }

        else if (size <= 30)
        {
            JOptionPane.showMessageDialog(null, "Машина большая!");
        }
        return 0;
    }
}
