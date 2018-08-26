package com.pattern.example.demo.structural.composite.src;

public abstract class ComponentFile {

    String fileName;

    public void printFileName() {
        System.out.println(this.fileName);
    }

    public String getFileName() {
        return this.fileName;
    }

    public void add(ComponentFile newFile) throws Exception {
        throw new Exception("Não pode inserir arquivos em: "
                + this.fileName + " - Não é uma pasta");
    }

    public void remove(String fileName) throws Exception {
        throw new Exception("Não pode remover arquivos em: "
                + this.fileName + " -Não é uma pasta");
    }

    public ComponentFile getFile(String fileName) throws Exception {
        throw new Exception("Não pode pesquisar arquivos em: "
                + this.fileName + " - Não é uma pasta");
    }
}
