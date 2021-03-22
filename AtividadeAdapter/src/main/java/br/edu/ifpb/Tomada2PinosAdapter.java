package br.edu.ifpb;

import com.katyusco.padroes.adpater.servicos.Fio;
import com.katyusco.padroes.adpater.servicos.ServicoTomada3Pinos;

public class Tomada2PinosAdapter extends ServicoTomada3Pinos implements Interface2Pinos {

    public Tomada2PinosAdapter(Fio fioVermelho, Fio fioAzulClaro, Fio fioVerdeAmarelo) {
        super(fioVermelho, fioAzulClaro, null);
    }

}
