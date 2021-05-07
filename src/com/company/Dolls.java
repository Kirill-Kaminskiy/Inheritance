package com.company;

import java.util.Arrays;

public class Dolls extends Toys {
    public String dresscolor;

    public Dolls(String name, String color, int cost, String dresscolor) {
        super(name, color, cost);
        this.dresscolor = dresscolor;
    }

    public Dolls() {

    }

    public String getDresscolor() {
        return dresscolor;
    }

    public void setDresscolor(String dresscolor) {
        this.dresscolor = dresscolor;
    }

    public String[] sortDress(String[] array) {
        Arrays.sort(array);
        return array;
    }

    @Override
    public int KategoryofCost()
    {
        if (cost < 4)
        {
            System.out.println("/(★ω★)/");
        }
        else if (cost < 8)
        {
            System.out.println("o(>ω<)o");
        }
        else if (cost < 12)
        {
            System.out.println("(ﾉ◕ヮ◕)ﾉ*:･ﾟ✧");
        }
        return 0;
    }

}