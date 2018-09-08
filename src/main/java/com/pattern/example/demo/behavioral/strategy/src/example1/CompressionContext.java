package com.pattern.example.demo.behavioral.strategy.src.example1;

import java.io.File;
import java.util.ArrayList;

public class CompressionContext {

    private CompressionStrategy strategy;

    //this can be set at runtime by the application preferences
    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    //use the strategy
    public void createArchive(ArrayList<File> files) {
        strategy.compressFiles(files);
    }
}