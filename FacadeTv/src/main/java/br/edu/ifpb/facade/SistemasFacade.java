package br.edu.ifpb.facade;

import br.edu.ifpb.api.SistemaDeAudio;
import br.edu.ifpb.api.SistemaDeInput;
import br.edu.ifpb.api.SistemaDeVideo;

public class SistemasFacade {

        private SistemaDeAudio audio;
        protected SistemaDeInput input;
        protected SistemaDeVideo video;
//Configurando subsistemas
        public void inicializarSubsistemas() {
            video = new SistemaDeVideo();
            video.configurarCores();
            video.configurarResolucao();

            input = new SistemaDeInput();
            input.configurarJoystick();
            input.configurarTeclado();

            audio = new SistemaDeAudio();
            audio.configurarCanais();
            audio.configurarFrequencia();
            audio.configurarVolume();
        }

//Utilizando subsistemas
        public void reproduzirAudio(String arquivo) {
            audio.reproduzirAudio(arquivo);
        }

        public void renderizarImagem(String imagem) {
            video.renderizarImagem(imagem);
        }

        public void lerInput() {
            input.lerInput();
        }


}
