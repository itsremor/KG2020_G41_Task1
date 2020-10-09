package ru.vsu.cs.elements;

import ru.vsu.cs.Drawable;

import java.awt.*;
import java.awt.geom.Path2D;

public class Table implements Drawable {
    private int height;
    private int width;

    public Table(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Graphics2D gr) {
        int tableWidth = width / 10;
        int tableHeight = (int)(tableWidth / 1.5);
        int stickHeight = tableHeight;
        int stickWidth = tableWidth / 8;

        int startPointX = width / 8;
        int startPointY = height - stickHeight - tableHeight;

        gr.setColor(new Color(29, 152, 179));
        gr.fillRect(startPointX,startPointY,tableWidth,tableHeight);
        gr.setColor(Color.BLACK);
        gr.drawRect(startPointX,startPointY,tableWidth,tableHeight);

        int dx = startPointX + (tableWidth - stickWidth) / 2;
        int dy = startPointY + tableHeight;

        gr.setColor(Color.GRAY);
        gr.fillRect(dx,dy,stickWidth,stickHeight);
        gr.setColor(Color.BLACK);
        gr.drawRect(dx,dy,stickWidth,stickHeight);

        gr.setColor(Color.WHITE);
        gr.drawString("MAGIC CITY", startPointX + tableWidth/10,startPointY + tableHeight/2);
    }
}
