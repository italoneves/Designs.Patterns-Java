package br.edu.ifpb;

import com.katyusco.padroes.adpater.servicos.Fio;
import com.katyusco.padroes.adpater.servicos.ServicoTomada3Pinos;

public class ClientePlugParaTomada2Pinos {

    private Fio pinoFase;
    private Fio pinoNeutro;

    public ClientePlugParaTomada2Pinos(Fio pinoFase, Fio pinoNeutro) {
        this.pinoFase= pinoFase;
        this.pinoNeutro = pinoNeutro;

    }

    public void acoplaPlug() {

            Tomada2PinosAdapter adapter = new Tomada2PinosAdapter(Fio.FASE,Fio.NEUTRO,null);
            adapter.forneceEnergia();
    }


    public static void main(String[] args) {
        ClientePlugParaTomada2Pinos clientePlugParaTomada2Pinos = new ClientePlugParaTomada2Pinos(Fio.FASE,Fio.NEUTRO);
        clientePlugParaTomada2Pinos.acoplaPlug();
    }
}


