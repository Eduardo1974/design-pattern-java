package com.pattern.example.demo.gof.behavioral.strategy.src.example1;

import java.io.File;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        CompressionContext ctx = new CompressionContext();
        //we could assume context is already set by preferences
        ctx.setCompressionStrategy(new ZipCompressionStrategy());
        //get a list of files...
        ctx.createArchive(new ArrayList<File>());
    }
}
