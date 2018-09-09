package com.pattern.example.demo.behavioral.template_method.src.example1;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    protected List<MP3Music> musics;
    protected TemplatePlayer templateOrder;

    public Playlist(TemplatePlayer templateOrder) {
        this.musics = new ArrayList<>();
        this.templateOrder = templateOrder;
    }

    public void addMusic(String name, String author, String year, int star) {
        musics.add(new MP3Music(name, author, year, star));
    }

    public void showPlaylist() {
        for (MP3Music music : musics) {
            System.out.println(music.toString());
        }
    }
    
    public void playMusics() {
        templateOrder.playMusics(musics);
    }

    public void changePlayListOrder(TemplatePlayer templateOrder) {
        this.templateOrder = templateOrder;
    }
}
