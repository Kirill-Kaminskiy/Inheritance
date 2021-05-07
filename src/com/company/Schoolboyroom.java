package com.company;

import javax.swing.*;

public class Schoolboyroom extends Rooms {
    public int timework;

    public Schoolboyroom(double square, String name) {
        super(square, name);
    }

    public Schoolboyroom(int timework) {
        this.timework = getTimework();
    }

    public int getTimework() {
        return timework;
    }

    public void setTimework(int timework) {
        this.timework = timework;
    }

    public int getTimeWork()
    {
        String str = JOptionPane.showInputDialog(null, "Введите время в формате (чч, 24 == 00)", JOptionPane.QUESTION_MESSAGE);
        int time = Integer.parseInt(str);

        while (time != 0) {
            while (time >= 8 && time <= 14) {
                JOptionPane.showMessageDialog(null, "Чёт рановато! Школота, как ни странно, ещё в школе!");
                str = JOptionPane.showInputDialog(null, "Введите время в формате (чч, 24 == 00)", JOptionPane.QUESTION_MESSAGE);
                time = Integer.parseInt(str);
            }

            while (time >= 14 && time <= 18) {
                JOptionPane.showMessageDialog(null, "Самое время школоте развлечся!");
                str = JOptionPane.showInputDialog(null, "Введите время в формате (чч, 24 == 00)", JOptionPane.QUESTION_MESSAGE);
                time = Integer.parseInt(str);
            }

            while (time >= 18 && time <= 22) {
                JOptionPane.showMessageDialog(null, "Школоте так-то уроки делать нужно и колыханку смотреть!");
                str = JOptionPane.showInputDialog(null, "Введите время в формате (чч, 24 == 00)", JOptionPane.QUESTION_MESSAGE);
                time = Integer.parseInt(str);
            }

            while (time >= 18 && time <= 22) {
                JOptionPane.showMessageDialog(null, "Школоте так-то уроки делать нужно и колыханку смотреть!");
                str = JOptionPane.showInputDialog(null, "Введите время в формате (чч, 24 == 00)", JOptionPane.QUESTION_MESSAGE);
                time = Integer.parseInt(str);
            }

            while (time >= 22 && time <= 24)
            {
                JOptionPane.showMessageDialog(null, "Комната закрыта");
                str = JOptionPane.showInputDialog(null, "Введите время в формате (чч, 24 == 00)", JOptionPane.QUESTION_MESSAGE);
                time = Integer.parseInt(str);
            }
        }
        return 0;
    }
}

