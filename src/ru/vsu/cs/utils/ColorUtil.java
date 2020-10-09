package ru.vsu.cs.utils;

import java.awt.*;
import java.util.Random;

public class ColorUtil {
    public static Color getRandomColor(){
        Random rnd = new Random();
        return new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
    }
}
