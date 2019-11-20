package Casa.concrete;

import EfeitoEspecial.interfaces.EfeitoEspecial;
import Posicao.Posicao;
import Casa.interfaces.Casa;

public class CasaEscada extends Casa {

    public CasaEscada(int numero, Posicao posicao, EfeitoEspecial efeitoEspecial) {
        super(numero, posicao, efeitoEspecial);
    }

    @Override
    public Posicao posicaoEfeito() {
        return this.getEfeitoEspecial().posicaoEfeito();
    }
}
