import javax.swing.*;
import java.awt.*;

//нарисовать skyline в стиле бэкграунда ЛСП.

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        //0;0 - верхний левый угол, ось икс - вправо, ось игрик - вниз

        Sun sun = new Sun(250, 250, 100, 200, 166, Color.red);
        //sun.draw(gr);

        Sky sky = new Sky(800, 600, 16);
        sky.draw(gr);

        Ground ground = new Ground(800, 600, 35);
        ground.draw(gr);
    }

    //запускается в методе paint, чтобы работало
}
