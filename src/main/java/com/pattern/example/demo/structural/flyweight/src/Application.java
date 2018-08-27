package com.pattern.example.demo.structural.flyweight.src;

public class Application {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        factory.getFlyweight(FlyweightFactory.Sprites.CENARIO_1).drawImage(new Point(0, 0));
        factory.getFlyweight(FlyweightFactory.Sprites.JOGADOR).drawImage(new Point(10, 10));
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_1).drawImage(new Point(100, 10));
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_1).drawImage(new Point(120, 10));
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_1).drawImage(new Point(140, 10));
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_2).drawImage(new Point(60, 10));
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_2).drawImage(new Point(50, 10));
        factory.getFlyweight(FlyweightFactory.Sprites.INIMIGO_3).drawImage(new Point(170, 10));
    }
}
