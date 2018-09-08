package com.pattern.example.demo.behavioral.strategy.src.example1;

import java.io.File;
import java.util.ArrayList;

public class RarCompressionStrategy implements CompressionStrategy {

    @Override
    public void compressFiles(ArrayList<File> files) {
        //using RAR approach
    }
}