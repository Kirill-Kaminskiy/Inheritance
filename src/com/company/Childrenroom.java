package com.company;

import javax.swing.*;

public class Childrenroom extends Rooms {
    public int agechild;

    public Childrenroom(double square, String name) {
        super(square, name);
    }

    public Childrenroom() {
        this.agechild = getAgeChild();
    }

    public int getAgechild() {
        return agechild;
    }

    public void setAgechild(int agechild) {
        this.agechild = agechild;
    }

    public int getAgeChild()
    {
        String str1 = JOptionPane.showInputDialog(null, "Введите количество детей:", JOptionPane.QUESTION_MESSAGE);
        int size = Integer.parseInt(str1);

        int [] array = new int[size];

        int sum = 0;
        for (int i = 0; i < size; i++)
        {
            String str2 = JOptionPane.showInputDialog(null, "Введите возраст ребёнка:", JOptionPane.QUESTION_MESSAGE);
            int elem = Integer.parseInt(str2);
            array[i] += elem;
            sum = sum + array[i];
        }

        System.out.println("Суммарный возраст детей: " + sum);

        return sum;
    }

    @Override
    public String toString() {
        return "Childrenroom{" +
                "agechild=" + agechild +
                '}';
    }
}
