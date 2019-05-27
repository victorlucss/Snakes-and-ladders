package EfeitoEspecial.concrete;

import EfeitoEspecial.interfaces.Obstaculo;
import Posicao.Posicao;

public class CobraEfeitoEspecial extends Obstaculo {

    public CobraEfeitoEspecial(Posicao posicao) {
        super(posicao);
    }

    @Override
    public Posicao aplicarEfeito() {
        return null;
    }
}
