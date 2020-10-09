package ru.vsu.cs.utils;

import ru.vsu.cs.Drawable;

import java.awt.*;
import java.util.Random;

public class HouseDrawUtil {
    public static void drawHouse(Graphics2D gr, int height, int width, int houseHeight, int windows, int floors, int startX) {
        int windowSize = houseHeight / (floors * 2 + 1);
        int houseWidth = windowSize * (windows * 2 + 1);

        //выполняется отрисовка фасада здания
        int startY = (height * 9 / 15) - houseHeight;
        gr.setColor(ColorUtil.getRandomColor());
        gr.fillRect(startX, startY, houseWidth, houseHeight);
        gr.setColor(Color.BLACK);
        gr.drawRect(startX, startY, houseWidth, houseHeight);

        //цикл отрисовывает окна в доме

        //dp - drawPoint
        int dpX;
        int dpY = startY + windowSize;
        boolean light;

        Color lights[] = {new Color (255,255,0), new Color (70, 70, 0)};
        //по i - проходим по этажу(строки), по j - по отдельным окнам (колонны)
        Random rnd = new Random();
        for (int i = 0; i < floors; i++) {
            dpX = startX + windowSize;
            for (int j = 0; j < windows; j++) {
                light = rnd.nextBoolean();
                if(light) gr.setColor(lights[0]);
                else gr.setColor(lights[1]);

                gr.fillRect(dpX,dpY,windowSize,windowSize);

                gr.setColor(Color.BLACK);
                gr.drawRect(dpX,dpY,windowSize,windowSize);

                dpX += windowSize*2;
            }
            dpY += windowSize*2;

        }
    }
}
