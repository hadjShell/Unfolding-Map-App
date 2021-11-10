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
        fill(255, 209, 0);
        ellipse(width/5, height/5, 50, 50);
    }
}
