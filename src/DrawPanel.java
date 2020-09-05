import javax.swing.*;
import java.awt.*;

//нарисовать skyline в стиле бэкграунда ЛСП.

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        //0;0 - верхний левый угол, ось икс - вправо, ось игрик - вниз

        Sun sun = new Sun(-50, -50, 100, 200, 15, Color.ORANGE);
        sun.draw(gr);
    }

    //запускается в методе paint, чтобы работало
    public static void drawSun(Graphics2D gr, int x, int y, int r, int R, int countOfBeams, Color color){
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
