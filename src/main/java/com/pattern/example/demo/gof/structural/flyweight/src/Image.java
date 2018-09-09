package com.pattern.example.demo.gof.structural.flyweight.src;

public class Image {

    protected String imageName;

    public Image(String image) {
        imageName = image;
    }

    public void drawImage() {
        System.out.println(imageName + " desenhada!");
    }
}
