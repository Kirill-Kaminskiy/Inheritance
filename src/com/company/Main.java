package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Toys [] array = {new BigCar("Большая машина", "Пурпурный", 6, 5, "Mazda", 15),
                new MiddleCar("Маленькая машинка", "Красный", 8, 10, "Mazda", 20),
                new SmallCar("Маленькая машинка", "Красный", 8, 10, "Mazda", "Mini"),
                new Blocks("Кубик", "Cиний", 12, 5),
                new Dolls("Кукла", "Кремовый", 8, "Красный"),
                new Balls("Мяч", "Синий", 10,"большой")
        };

        Toys t = new Toys("Игрушка", "Default", 9);
        Rooms r = new Rooms(10, "Default!");
        Kidsroom kr = new Kidsroom(80,"Комната для малышей");
        Childrenroom cr = new Childrenroom(120, "Комната для детей");
        Schoolboyroom sh = new Schoolboyroom(160, "Комната для школьников");
        BigCar bg = new BigCar("Большая машина", "Пурпурный", 6, 5, "Mazda", 15);
        MiddleCar mc = new MiddleCar("Маленькая машинка", "Красный", 8, 10, "Mazda", 20);
        SmallCar sc = new SmallCar("Маленькая машинка", "Красный", 8, 10, "Mazda", "Mini");
        Blocks bl = new Blocks("Кубик", "Cиний", 12, 5);
        Dolls dl = new Dolls("Кукла", "Кремовый", 8, "Красный");
        Balls bls = new Balls("Мяч", "Синий", 10,"большой");

        Toys.bubbleSort(array);
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }



        //kr.getCountKids();
        //cr.getAgeChild();
        //sh.getTimeWork();
        //mc.KategoryofCost();
        //sc.SafetyTest();
        //System.out.println(bl.getVolume());
        //System.out.println(Arrays.toString(dl.sortDress(new String[]{"Синие", "Красное", "Ананасовое", "Банановое", "Яблочное"})));
        //bls.KategoryofCost();

    }
}
