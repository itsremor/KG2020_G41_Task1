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
        int r = 0;
        int g = 0;
        int b = 100;

        int currentSize;

        int centerX = width / 2;
        int centerY = height / 2;

        Color currentColor;


        for (double i = 0; i < fadeCounts; i++){
            currentColor = new Color(r,g,b);
            gr.setColor(currentColor);

            //здесь происходит изменение градиента. Фактически, может быть кастомизировано

            b+= 100 / fadeCounts;

            //происходит расчёт размера градиентных кругов, и, соответственно, их отрисовка
            currentSize = (int) (Math.sqrt(width*width + height*height) / (i * 1.25));
            gr.fillOval(centerX - currentSize/2,centerY - currentSize/2,currentSize,currentSize);
        }
    }
}
