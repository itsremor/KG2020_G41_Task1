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

    }
}
