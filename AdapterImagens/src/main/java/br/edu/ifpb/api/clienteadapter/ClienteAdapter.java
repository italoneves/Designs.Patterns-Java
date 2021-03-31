package br.edu.ifpb.api.clienteadapter;

import br.edu.ifpb.api.adapter.ImagemTarget;
import br.edu.ifpb.api.adapter.OpenGLImageAdapter;
import br.edu.ifpb.api.adapter.SdlImagemAdapter;

public class ClienteAdapter {

    public static void main(String[] args) {
        ImagemTarget imagem = new SdlImagemAdapter();
        imagem.carregarImagem("teste.png");
        imagem.desenharImagem(0, 0, 10, 10);

        imagem = new OpenGLImageAdapter();
        imagem.carregarImagem("teste.png");
        imagem.desenharImagem(0, 0, 10, 10);
    }
}
