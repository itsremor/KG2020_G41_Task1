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
        float[] hsbvals = new float[0];
        int r = 0;
        int g = 72;
        int b = 0;



        int currentX = 0;
        int currentY = height * 9 / 15;
        //int pixelCount = (int)(height*(float)(6/15)/fadeCounts);
        int pixelCount = height * 6 / 15 / fadeCounts;

        for (int i = 0; i < fadeCounts; i++) {
            hsbvals = Color.RGBtoHSB(r,g,b,null);
            Color currentColor = Color.getHSBColor(hsbvals[0], hsbvals[1], hsbvals[2]);

            gr.setColor(currentColor);

            gr.fillRect(currentX, currentY, width, pixelCount);
            currentY += pixelCount;

            g+= (255-72)/fadeCounts;
        }
    }
}
