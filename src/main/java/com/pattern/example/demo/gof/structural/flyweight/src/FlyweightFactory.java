package com.pattern.example.demo.gof.structural.flyweight.src;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    protected Map<Sprites, SpriteFlyweight> flyweights;

    public enum Sprites {
        JOGADOR, INIMIGO_1, INIMIGO_2, INIMIGO_3, CENARIO_1, CENARIO_2
    }

    public FlyweightFactory() {
        flyweights = new HashMap<>();
        flyweights.put(Sprites.JOGADOR, new Sprite("jogador.png"));
        flyweights.put(Sprites.INIMIGO_1, new Sprite("inimigo1.png"));
        flyweights.put(Sprites.INIMIGO_2, new Sprite("inimigo2.png"));
        flyweights.put(Sprites.INIMIGO_3, new Sprite("inimigo3.png"));
        flyweights.put(Sprites.CENARIO_1, new Sprite("cenario1.png"));
        flyweights.put(Sprites.CENARIO_2, new Sprite("cenario2.png"));
    }

    public SpriteFlyweight getFlyweight(Sprites jogador) {
        return flyweights.get(jogador);
    }
}
