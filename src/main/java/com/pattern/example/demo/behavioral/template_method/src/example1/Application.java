package com.pattern.example.demo.behavioral.template_method.src.example1;

public class Application {

    public static void main(String[] args) {

        Playlist myPlayList = new Playlist(new OrderByName());
        myPlayList.addMusic("Everlong", "Foo Fighters", "1997", 5);
        myPlayList.addMusic("Song 2", "Blur", "1997", 4);
        myPlayList.addMusic("American Jesus", "Bad Religion", "1993", 3);
        myPlayList.addMusic("No Cigar", "Milencollin", "2001", 2);
        myPlayList.addMusic("Ten", "Pearl Jam", "1991", 1);

        System.out.println("=== Lista por Nome de Musica ===");
        myPlayList.showPlaylist();
        myPlayList.playMusics();

        System.out.println("\n=== Lista por Autor ===");
        myPlayList.changePlayListOrder(new OrderByAuthor());
        myPlayList.showPlaylist();
        myPlayList.playMusics();

        System.out.println("\n=== Lista por Ano ===");
        myPlayList.changePlayListOrder(new OrderByYear());
        myPlayList.showPlaylist();
        myPlayList.playMusics();

        System.out.println("\n=== Lista por Estrela ===");
        myPlayList.changePlayListOrder(new OrderByStar());
        myPlayList.showPlaylist();
        myPlayList.playMusics();
    }
}
