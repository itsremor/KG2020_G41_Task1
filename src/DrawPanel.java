import javax.swing.*;
import java.awt.*;

//нарисовать skyline в стиле бэкграунда ЛСП.

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;

        Sky sky = new Sky(getWidth(),getHeight(), 16);
        sky.draw(gr);
        Stars stars = new Stars(20, getWidth(), getHeight());
        stars.draw(gr);
        Ground ground = new Ground(getWidth(), getHeight(), 25);
        ground.draw(gr);


    }

    //запускается в методе paint, чтобы работало
}
