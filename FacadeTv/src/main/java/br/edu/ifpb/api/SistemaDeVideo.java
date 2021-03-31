package br.edu.ifpb.api;

public class SistemaDeVideo {

    public void configurarCores(){
        System.out.println("Cores configurada");
    }
    public void configurarResolucao(){
        System.out.println("Resolução configurada");
    }

    public void renderizarImagem(String imagem) {
        System.out.println("Renderizando" + imagem);
    }

}
