package ru.vsu.cs.elements;

// добавить летающую тарелку

import ru.vsu.cs.Drawable;

import java.awt.*;

public class Sky implements Drawable {

    private int fadeCounts;
    private int width;
    private int height;

    public Sky(int width, int height, int fadeCounts){
        this.fadeCounts = fadeCounts;
        this.width = width;
        this.height = height;
    }


    @Override
    public void draw(Graphics2D gr) {
        int r = 0;
        int g = 0;
        int b = 50;
        //gr.setPaint(new GradientPaint());

        double size = Math.sqrt(width*width + height*height);
        double currentSize = size;
        int centerX = width / 2;
        int centerY = height / 2;

        Color currentColor;


        for (double i = 0; i < fadeCounts; i++){
            currentColor = new Color(r,g,b);
            gr.setColor(currentColor);

            //здесь происходит изменение градиента. Фактически, может быть кастомизировано

            b += 100 / fadeCounts;

            //происходит расчёт размера градиентных кругов, и, соответственно, их отрисовка

            gr.fillOval(centerX - (int)currentSize/2,centerY - (int)currentSize/2,(int)currentSize,(int)currentSize);
            currentSize /= 1 + (1 / (double)+fadeCounts);
        }
    }
}
