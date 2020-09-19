import java.awt.*;

public class Ground implements Drawable{

    private int width;
    private int height;
    private int fadeCounts;

    public Ground(int width, int height, int fadeCounts){
        this.fadeCounts = fadeCounts;
        this.width = width;
        this.height = height;
    }



    @Override
    public void draw(Graphics2D gr) {

        int r = 0;
        int g = 50;
        int b = 0;



        int currentX = 0;
        int currentY = height * 9 / 15;
        int pixelCount = height * 7 / 15 / fadeCounts;
        Color currentColor;

        for (int i = 0; i < fadeCounts; i++) {
            currentColor = new Color(r,g,b);
            gr.setColor(currentColor);

            gr.fillRect(currentX, currentY, width, pixelCount);
            currentY += pixelCount;

            g+= 100/fadeCounts;
        }
    }
}
