package com.company;

public class Balls extends Toys{
    public String type;

    public Balls(String name, String color, int cost, String type) {
        super(name, color, cost);
        this.type = type;

    }

    public Balls()
    {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int KategoryofCost()
    {
        int small_size = 10;
        int middle_size = 20;
        int big_size = 30;

        if (type.equalsIgnoreCase("малый"))
        {
           int difference = middle_size - small_size;
           small_size += difference;
            System.out.println("Мы надули малый шар до размера среднего: " + small_size);
        }
        else if (type.equalsIgnoreCase("средний"))
        {
            int difference = big_size - middle_size;
            middle_size += difference;
            System.out.println("Мы надули cредний шар до размера большого: " + middle_size);
        }
        else if (type.equalsIgnoreCase("большой"))
        {
            int difference = big_size - small_size;
            big_size -= difference;
            System.out.println("Мы cдули большой шар до размера маленького: " + big_size);
        }
        return 0;
    }
}
