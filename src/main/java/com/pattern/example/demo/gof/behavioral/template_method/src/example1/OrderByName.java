package com.pattern.example.demo.gof.behavioral.template_method.src.example1;

import java.util.Comparator;
import java.util.List;

public class OrderByName extends TemplatePlayer {

    @Override
    public void orderPlaylist(List<MP3Music> playlist) {
        playlist.sort(Comparator.comparing(MP3Music::getName));
    }
}
