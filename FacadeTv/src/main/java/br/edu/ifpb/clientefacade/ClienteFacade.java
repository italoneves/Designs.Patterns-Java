package br.edu.ifpb.clientefacade;

import br.edu.ifpb.facade.SistemasFacade;

public class ClienteFacade
{
    public static void main( String[] args )
    {
        System.out.println("\n" + "##### Configurando subsistemas #####" +"\n");
        SistemasFacade fachada = new SistemasFacade();
        fachada.inicializarSubsistemas();

        System.out.println("\n"+ "##### Utilizando subsistemas #####" +"\n");
        fachada.renderizarImagem("imagem.png");
        fachada.reproduzirAudio("teste.mp3");
        fachada.lerInput();
    }
}
