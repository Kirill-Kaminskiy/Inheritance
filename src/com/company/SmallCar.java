package com.company;

import javax.swing.*;


public class SmallCar extends Cars{
    public String type;

    public SmallCar(String name, String color, int cost, int size, String brand, String type) {
        super(name, color, cost, size, brand);
        this.type = type;

    }

    public SmallCar()
    {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String SafetyTest () throws InterruptedException {
        double side_1 = 1 + Math.random() * 10;
        double side_2 = 1 + Math.random() * 10;
        double side_3 = 1 + Math.random() * 10;

        double square = side_1 * side_2 * side_3;

        String str1 = JOptionPane.showInputDialog(null, "Выберите машину для теста: \n" +
                "Mini Cooper, \n" +
                "Volkswagen Golf, \n" +
                "Suzuki Swift, \n" +
                "Nissan Juke \n");

        int razgon = 0;
        double strength = 0;
        switch (str1)
        {
            case "Mini Cooper":
                strength = 100;
                System.out.println("Разгоняем ваш " + str1 + " для теста...");
                for (int i = 0; i <= 10; i++)
                {
                    System.out.println(razgon + " км/ч...");
                    razgon += 10;
                    Thread.sleep(700);
                }

                if (strength > square)
                {
                    System.out.println("Тест прочности пройден!");
                }
                else if (strength < square )
                {
                    System.out.println("Ваша мащина разбилась вдребезги! Нам очень жаль, но мы вам ничего не возместим");
                }
                break;

            case "Volkswagen Golf":
                strength = 300;
                System.out.println("Разгоняем ваш " + str1 + " для теста...");
                for (int i = 0; i <= 10; i++)
                {
                    System.out.println(razgon + " км/ч...");
                    razgon += 10;
                    Thread.sleep(700);
                }

                if (strength > square)
                {
                    System.out.println("Тест прочности пройден!");
                }
                else if (strength < square )
                {
                    System.out.println("Ваша машина разбилась вдребезги! Нам очень жаль, но мы вам ничего не возместим");
                }
                break;
            case "Suzuki Swift":
                strength = 600;
                System.out.println("Разгоняем ваш " + str1 + " для теста...");
                for (int i = 0; i <= 10; i++)
                {
                    System.out.println(razgon + " км/ч...");
                    razgon += 10;
                    Thread.sleep(700);
                }

                if (strength > square)
                {
                    System.out.println("Тест прочности пройден!");
                }
                else if (strength < square )
                {
                    System.out.println("Ваша мащина разбилась вдребезги! Нам очень жаль, но мы вам ничего не возместим");
                }
                break;
            case "Nissan Juke":
                strength = 900;
                System.out.println("Разгоняем ваш " + str1 + " для теста...");
                for (int i = 0; i <= 10; i++)
                {
                    System.out.println(razgon + " км/ч...");
                    razgon += 10;
                    Thread.sleep(700);
                }

                if (strength > square)
                {
                    System.out.println("Тест прочности пройден!");
                }
                else if (strength < square )
                {
                    System.out.println("Ваша мащина разбилась вдребезги! Нам очень жаль, но мы вам ничего не возместим");
                }
                break;

            default:
                System.out.println("Error!" );
                break;
        }
        return "";
    }

    @Override
    public int KategoryofCost()
    {
        if (cost <= 4 && brand.equalsIgnoreCase("Mini Cooper"))
        {
            System.out.println("Бро да это подделка!");
        }

        else if (cost <= 8 && brand.equalsIgnoreCase("Volkswagen Golf"))
        {
            System.out.println("Чёт подозрительно!");
        }

        else if (cost <= 10 && brand.equalsIgnoreCase("Nissan Juke"))
        {
            System.out.println("О норм! Даже немного оверпрайс!");
        }
        return 0;
    }



}
