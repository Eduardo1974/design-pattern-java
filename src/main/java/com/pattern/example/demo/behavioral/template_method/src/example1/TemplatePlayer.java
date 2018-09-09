package com.pattern.example.demo.behavioral.template_method.src.example1;

import java.util.List;

public abstract class TemplatePlayer {

    public void playMusics(List<MP3Music> playlist) {
        orderPlaylist(playlist);
        playlist.forEach(mp3Music -> System.out.println("Executando: " + mp3Music.toString()));
    }

    public abstract void orderPlaylist(List<MP3Music> playlist);

}
