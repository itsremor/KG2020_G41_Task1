import java.awt.*;
import java.util.Random;

public class Stars implements Drawable{
    private int countOfStars;
    private int width;
    private int height;

    public Stars(int countOfStars, int width, int height){
        this.countOfStars = countOfStars;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics2D gr) {
        Random rnd = new Random();
        int centerX;
        int centerY;
        int size;

        int r;
        int g;
        int b;
        Color currentColor;

        for (int i = 0; i < countOfStars; i++) {
            r = 86;
            g = 119;
            b = 238;

            size = 7;
            centerX = rnd.nextInt(width);
            centerY = rnd.nextInt(width * 9 / 15);

            for (int j = 0; j < 2; j++) {
                currentColor = new Color(r,g,b);
                gr.setColor(currentColor);
                gr.fillOval(centerX - size / 2, centerY - size / 2, size, size);
                size /= 2;
                r+= 20;
                g+= 20;
            }
        }


    }


}
