package ru.vsu.cs.elements;

import ru.vsu.cs.Drawable;

import java.awt.*;

public class Road implements Drawable {
    private int height;
    private int width;

    public Road(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Graphics2D gr) {
        int topSize = width / 15;
        int topSkip = (width - topSize) / 2;
        int bottomSize = width * 8 / 15;
        int bottomSkip = (width - bottomSize) / 2;

        int[] xPoints = {topSkip, topSkip+topSize, bottomSkip+bottomSize,bottomSkip};
        int[] yPoints = {height * 9 / 15, height * 9 / 15, height, height};

        gr.setColor(new Color(62, 62, 62));
        gr.fillPolygon(xPoints,yPoints,4);
        gr.setColor(Color.BLACK);
        gr.drawPolygon(xPoints,yPoints,4);

    }
}
