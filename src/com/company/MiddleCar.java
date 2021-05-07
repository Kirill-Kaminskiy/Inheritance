package com.company;

import javax.swing.*;

public class MiddleCar extends Cars {
    public int count;

    public MiddleCar(String name, String color, int cost, int size, String brand, int count) {
        super(name, color, cost, size, brand);
        this.count = count;
    }

    public MiddleCar()
    {

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int KategoryofCost() throws InterruptedException {
        if (count <= 10)
        {
            System.out.println("Эти машины мы отправим на Москву!");
            for (int i = 0; i <= count; i++)
            {
                System.out.println("Процесс загрузки...");
                Thread.sleep(500);
            }
        }
        else if (count <= 20)
        {
            System.out.println("Эти машины мы отправим на Минск!");
            for (int i = 0; i <= count; i++)
            {
                System.out.println("Процесс загрузки...");
                Thread.sleep(600);
            }
        }
        else if (count <= 30)
        {
            System.out.println("Эти машины мы отправим на Варшаву!");
            for (int i = 0; i <= count; i++)
            {
                System.out.println("Процесс загрузки...");
                Thread.sleep(700);
            }
        }
        return 0;
    }

    public int NormSpeed()
    {
        double normspeed = 60;
        double speed = 30 + Math.random() * 150;

        if (speed <= 60)
        {
            System.out.println("Вы ровный поцик! Продолжайте в том же духе!");
        }
        else if (speed >= 60 && speed <= 120)
        {
            System.out.println("Чёт нарушаем! Снизь скорость, шоб штрафа не было!");
        }
        else if (speed >= 120 && speed <= 150)
        {
            System.out.println("Не гоняйте пацаны, вы матерям ещё нужны!");
        }
        return 0;

    }

    public int Construction()
    {
        String str = JOptionPane.showInputDialog(null,"Выберите констуркторский вариант" +
                " (улучшенная: подвеска, закись, двигатель)");

        if (str.equalsIgnoreCase("улучшенная подвеска"))
        {
            JOptionPane.showMessageDialog(null, "За подвеску + 2 к цене и размеру...");
            setCount(+2);
            setSize(+2);
        }
        else if (str.equalsIgnoreCase("улучшенная закись"))
        {
            JOptionPane.showMessageDialog(null, "За закись + 4 к цене и размеру...");
            setCount(+4);
            setSize(+4);
        }
        else if (str.equalsIgnoreCase("улучшенный двигатель"))
        {
            JOptionPane.showMessageDialog(null, "За двигатель + 6 к цене и размеру...");
            setCount(+6);
            setSize(+6);
        }
        return 0;
    }


}
