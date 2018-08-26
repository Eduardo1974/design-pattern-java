package com.pattern.example.demo.structural.composite.src;

public class Application {

    public static void main(String[] args) {

        // O usuário do código não precisa saber detalhes das implementações dos
        // objetos. Consegue manipular os objetos a partir da interface comum:
        // ArquivoComponent.
        ComponentFile myFolder = new FileComposite("Minha Pasta/");
        ComponentFile myVideo = new VideoFile("meu video.avi");
        ComponentFile anotherVideo = new VideoFile("serieS01E01.mkv");
        ComponentFile anotherFolder = new FileComposite("Minha Pasta 2/");
        ComponentFile movie = new VideoFile("avengers.avi");

        try {
            // Como a interface define operações comuns a todos os arquivo é
            // possível tentar inserir um arquivo em um arquivo
            myVideo.add(anotherVideo);
        } catch (Exception e) {
            // No entanto você deve tratar este tipo de comportamento com
            // exceções ou outros métodos
            System.out.println(e.getMessage());
        }

        try {
            anotherFolder.add(movie);
            myFolder.add(myVideo);
            myFolder.add(anotherVideo);
            myFolder.add(anotherFolder);
            myFolder.printFileName();
        } catch (Exception e) {
            // Não será executado pois minha pasta é um ArquivoComposite e
            // possui todas as operações de gerenciamento dos arquivos
            // implementadas.
            System.out.println(e.getMessage());
        }

        try {
            // O problema dessa implementação é que o usuário do código precisa
            // sempre verificar se pode realizar as operações, pois não se tem
            // certeza sobre o tipo do objeto utilizado
            System.out.println("\nPesquisando arquivos:");
            myFolder.getFile(myVideo.getFileName()).printFileName();

            System.out.println("\nPesquisando arquivos em subpastas:");
            myFolder.getFile(anotherFolder.getFileName()).printFileName();

            System.out.println("\nRemover arquivos");
            myFolder.remove(myVideo.getFileName());
            myFolder.printFileName();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
