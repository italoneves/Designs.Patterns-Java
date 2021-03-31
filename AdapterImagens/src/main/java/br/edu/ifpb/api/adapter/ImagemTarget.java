package br.edu.ifpb.api.adapter;

public interface ImagemTarget {

        void carregarImagem(String nomeDoArquivo);

        void desenharImagem(int posX, int posY, int largura, int altura);
}
