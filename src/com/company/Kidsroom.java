package com.company;

import javax.swing.*;

public class Kidsroom extends Rooms {
    public int countk;

    public Kidsroom(double square, String name) {
        super(square, name);
    }

    public Kidsroom(int countk) {
        this.countk = getCountKids();
    }

    public int getCountk() {
        return countk;
    }

    public void setCountk(int countk) {
        this.countk = countk;
    }

    @Override
    public String toString() {
        return "Комната - " +
                "количество детей в комнате: " + countk +
                ", площадь:" + square +
                ", имя комнаты: " + name + '\'' +
                '}';
    }

    public int getCountKids() {
        double minsquare = 6;
        String str1 = JOptionPane.showInputDialog(null, "Введите количество детей, которое хотите поместить в комнату", JOptionPane.QUESTION_MESSAGE);
        int countk = Integer.parseInt(str1);
        double result = getSquare() / countk;

        while (result < minsquare) {
            JOptionPane.showMessageDialog(null, "Вы не выполнили норму жилой площади на человека!");
            str1 = JOptionPane.showInputDialog(null, "Введите количество детей, которое хотите поместить в комнату", JOptionPane.INFORMATION_MESSAGE);
            countk = Integer.parseInt(str1);
            result = getSquare() / countk;
        }

        System.out.println("Количество детей в комнате: " + countk);
        return countk;
    }
}