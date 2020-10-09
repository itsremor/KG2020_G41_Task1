package ru.vsu.cs.elements;

import ru.vsu.cs.Drawable;

import java.awt.*;
import java.util.Random;

public class Moon implements Drawable {

    private int width;
    private int height;
    private int size;

    public Moon(int width, int height, int size) {
        this.width = width;
        this.height = height;
        this.size = size;
    }

    @Override
    public void draw(Graphics2D gr) {
        Random rnd = new Random();

        int r = 216;
        int g = 221;
        int b = 0;

        Color currentColor = new Color(r,g,b);
        gr.setColor(currentColor);

        int x = rnd.nextInt(width - size);
        int y = rnd.nextInt(height * 4 / 15 - size);

        gr.fillOval(x,y,size,size);
        r -= 60;
        g -= 60;

        gr.setColor(new Color(r,g,b));
        int tmpSize = size / 4;
        int tmpX;
        int tmpY;
        int tmp;

        //toDO Сделать так, чтобы кратеры не вылазили за границы
        for (int i = 0; i < 6; i++) {
            tmp = size - tmpSize;
            tmpX = x + rnd.nextInt(tmp);
            tmpY = y + rnd.nextInt(tmp);

            gr.fillOval(tmpX, tmpY, tmpSize, tmpSize);
            tmpSize /= 1.15;
        }
    }
}
