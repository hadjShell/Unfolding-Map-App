package myDemo;

import processing.core.*;

public class MyPAppletDemo extends PApplet{
    private final String URL = "https://media.cntraveler.com/photos/59ef91dd8d4f736d51415c2e/master/w_2667,h_2000,c_limit/7MileBeach-2013-HiRes.jpg";
    private PImage backgroundImg;

    public void setup() {
        size(800, 600);
        backgroundImg = loadImage(URL, "jpg");
    }

    public void draw() {
        // dynamic proportionally resize
        backgroundImg.resize(0, height);
        image(backgroundImg, 0, 0);
        // color-changed sun
        int[] sunRGB = sunColor(second());
        fill(sunRGB[0], sunRGB[1], sunRGB[2]);
        ellipse(width/5, height/5, 50, 50);
    }

    // 30 secs yellow 0 sec black
    private int[] sunColor(int second) {
        int[] rgb = new int[3];
        float ratio = 1 - Math.abs(second - 30) / 30.0f;
        rgb[0] = (int) (255 * ratio);
        rgb[1] = (int) (255 * ratio);
        rgb[2] = 0;

        return rgb;
    }
}
