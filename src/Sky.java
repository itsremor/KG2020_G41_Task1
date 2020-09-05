import java.awt.*;

public class Sky implements Drawable {

    private int fadeCounts;
    private int width;
    private int height;

    public Sky(int width, int height, int fadeCounts){
        this.fadeCounts = fadeCounts;
        this.width = width;
        this.height = height;
    }


    @Override
    public void draw(Graphics2D gr) {


        int r = 255;
        int g = 0;
        int b = 255;
        float[] hsbvals = new float[0];
        int biggest = Math.max(width,height);
        int currentSize;
        int cordinate;

        for (int i = 0; i < fadeCounts; i++){
            hsbvals = Color.RGBtoHSB(r,g,b,null);
            Color currentColor = Color.getHSBColor(hsbvals[0], hsbvals[1], hsbvals[2]);

            currentSize = (int)Math.sqrt(width*width + height * height) / (2 * (i+1));

            //toDo определение координат для текущего градиентного круга
            gr.setColor(currentColor);
            //gr.fillOval();

            r -= 255/fadeCounts;
            b -= 255/fadeCounts;
        }

    }
}
