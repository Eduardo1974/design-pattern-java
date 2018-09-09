package com.pattern.example.demo.behavioral.template_method.src.example1;

import java.util.Comparator;
import java.util.List;

public class OrderByStar extends TemplatePlayer {

    @Override
    public void orderPlaylist(List<MP3Music> playlist) {
        playlist.sort(Comparator.comparing(MP3Music::getStar));
    }
}
