package com.pattern.example.demo.gof.behavioral.strategy.src.example1;

import java.io.File;
import java.util.ArrayList;

public class ZipCompressionStrategy implements CompressionStrategy {

    @Override
    public void compressFiles(ArrayList<File> files) {
        //using ZIP approach
    }
}