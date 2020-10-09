package ru.vsu.cs;

/*Создавать объекты в JPanel, а не в методе paint.
width height передаётся в метод paint, а не в конструктор
сделать это всё растягивающимся, а не как у меня сейчас
Рандомная генерация на этапе создания, задавая массив точек
*/

import ru.vsu.cs.elements.*;
import ru.vsu.cs.utils.HouseDrawUtil;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;

        Sky sky = new Sky(getWidth(),getHeight(), 100);
        sky.draw(gr);

        Stars stars = new Stars(40, getWidth(), getHeight());
        stars.draw(gr);

        Moon moon = new Moon(getWidth(), getHeight(), 90);
        moon.draw(gr);

        Ground ground = new Ground(getWidth(), getHeight(), 30);
        ground.draw(gr);

//        Houses house = new Houses(getHeight(), getWidth(), 190, 5, 9,20);
//        house.draw(gr);
        HouseDrawUtil.drawHouse(gr,getHeight(), getWidth(), 190, 5, 9,20);
        HouseDrawUtil.drawHouse(gr,getHeight(), getWidth(), 590, 5, 18,200);
    }
}