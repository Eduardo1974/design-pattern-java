package com.pattern.example.demo.structural.composite.src;

import java.util.ArrayList;

public class FileComposite extends ComponentFile {

    ArrayList<ComponentFile> files = new ArrayList<>();

    FileComposite(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void printFileName() {
        System.out.println(this.fileName);
        for (ComponentFile tmpFile : files) {
            tmpFile.printFileName();
        }
    }

    @Override
    public String getFileName() {
        return super.getFileName();
    }

    @Override
    public void add(ComponentFile newFile) throws Exception {
        this.files.add(newFile);
    }

    @Override
    public void remove(String fileName) throws Exception {
        for (ComponentFile tmpFile : files) {
            if (tmpFile.getFileName() == fileName) {
                this.files.remove(tmpFile);
                return;
            }
        }
        throw new Exception("Não existe este arquivo");
    }

    @Override
    public ComponentFile getFile(String fileName) throws Exception {
        for (ComponentFile tmpFile : files) {
            if (tmpFile.getFileName() == fileName) {
                return tmpFile;
            }
        }
        throw new Exception("Não existe este arquivo");
    }
}
