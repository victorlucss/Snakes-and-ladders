package EfeitoEspecial.concrete;

import EfeitoEspecial.interfaces.Obstaculo;
import Posicao.Posicao;

public class EscadaEfeitoEspecial extends Obstaculo {

    public EscadaEfeitoEspecial(Posicao posicao) {
        super(posicao);
    }

    @Override
    public Posicao aplicarEfeito() {
        return null;
    }
}
