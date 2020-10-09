package ru.vsu.cs.elements;

import ru.vsu.cs.Drawable;
import ru.vsu.cs.utils.ColorUtil;

import java.awt.*;
import java.util.Random;

public class Skyline implements Drawable {


    private int startX = 0;
    private int height;
    private int width;

    public Skyline(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Graphics2D gr) {
        Random rnd = new Random();

        int minHeight = height * 3 / 15;
        int maxHeight = height * 7 / 15;

        //цикл отрисовывает дома, пока весь скайлайн не будет заполнен
            while (startX < width){
                int houseHeight = rnd.nextInt(maxHeight - minHeight) + minHeight;

                int floors = rnd.nextInt(height/100) + 6;
                int windows = rnd.nextInt(height/100) + 2;

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
                startX += houseWidth + 5;
        }

    }
}
