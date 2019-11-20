package Casa.concrete;

import Casa.interfaces.Casa;
import EfeitoEspecial.interfaces.EfeitoEspecial;
import Posicao.Posicao;

public class CasaBonus extends Casa {

    public CasaBonus(int numero, Posicao posicao, EfeitoEspecial efeitoEspecial) {
        super(numero, posicao, efeitoEspecial);
    }

    @Override
    public Posicao posicaoEfeito() {
        return this.getEfeitoEspecial().posicaoEfeito();
    }
}
