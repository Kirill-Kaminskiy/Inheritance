package com.company;

public class Blocks extends Toys {
    public double side;

    public Blocks(String name, String color, int cost, double side) {
        super(name, color, cost);
        this.side = side;
    }

    public Blocks() {

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getVolume()
    {
        double volume = Math.pow(side, 3);
        return volume;
    }

    @Override
    public int KategoryofCost()
    {
        if (side <= 5 && cost < 5)
        {
            System.out.println("Это маленький кубик!");
        }
        else if (side <= 10 && cost < 10)
        {
            System.out.println("Это средний куб!");
        }
        else if (side <= 12 && cost < 12)
        {
            System.out.println("Это большой куб!");
        }
        return 0;
    }
}
