package ru.vsu.cs;

import ru.vsu.cs.elements.*;

import javax.swing.*;
import java.awt.*;

//нарисовать skyline в стиле бэкграунда ЛСП.

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;

        Sky sky = new Sky(getWidth(),getHeight(), 16);
        sky.draw(gr);
        Stars stars = new Stars(17, getWidth(), getHeight());
        stars.draw(gr);
        Moon moon = new Moon(getWidth(), getHeight(), 100);
        moon.draw(gr);
        Ground ground = new Ground(getWidth(), getHeight(), 25);
        ground.draw(gr);


    }

    //запускается в методе paint, чтобы работало
}
