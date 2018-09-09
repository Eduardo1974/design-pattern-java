package com.pattern.example.demo.gof.behavioral.template_method.src.example1;

public class MP3Music {

    String name;
    String author;
    String year;
    int star;

    public MP3Music(String name, String author, String year, int star) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public int getStar() {
        return star;
    }

    @Override
    public String toString() {
        return "MP3Music{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                ", star=" + star +
                '}';
    }
}
