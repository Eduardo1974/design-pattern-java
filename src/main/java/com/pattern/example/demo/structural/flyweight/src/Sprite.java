package com.pattern.example.demo.structural.flyweight.src;

public class Sprite extends SpriteFlyweight {

    protected Image image;

    public Sprite(String imageName) {
        image = new Image(imageName);
    }

    @Override
    public void drawImage(Point point) {
        image.drawImage();
        System.out.println("No ponto (" + point.x + "," + point.y + ")!");
    }
}
