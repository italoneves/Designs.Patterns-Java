package br.edu.ifpb.api.adapter;

import br.edu.ifpb.api.SdlSurface;

public class SdlImagemAdapter extends SdlSurface implements ImagemTarget {


    @Override
    public void carregarImagem(String nomeDoArquivo) {
            SDL_CarregarSurface(nomeDoArquivo);

    }

    @Override
    public void desenharImagem(int posX, int posY, int largura, int altura) {
            SDL_DesenharSurface(posX,posY,largura,altura);
    }
}
