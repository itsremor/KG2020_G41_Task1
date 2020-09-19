package ru.vsu.cs.elements;

import ru.vsu.cs.Drawable;

import java.awt.*;

public class Sun implements Drawable {

    private int x;
    private int y;
    private int r;
    private int R;
    private int countOfBeams;
    private Color color;

    public Sun(int x, int y, int r, int R, int countOfBeams, Color color){
        this.x = x;
        this.y = y;
        this.R = R;
        this.r = r;
        this.countOfBeams = countOfBeams;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D gr) {
        int coordinateX = x - r;
        int coordinateY = y - r;
        gr.setColor(color);
        gr.fillOval(coordinateX, coordinateY, r + r, r + r);

        double delta = 2 * Math.PI / countOfBeams;
        double dx1;
        double dx2;
        double dy1;
        double dy2;
        for (int i = 0; i < countOfBeams; i++){
            dx1 = r * Math.cos(delta * i);
            dx2 = R * Math.cos(delta * i);
            dy1 = r * Math.sin(delta * i);
            dy2 = R * Math.sin(delta * i);
            gr.drawLine((int)dx1 + x, (int)dy1 + y, (int)dx2 + x, (int)dy2 + y);
        }
    }


}
