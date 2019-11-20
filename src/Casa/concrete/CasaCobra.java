package Casa.concrete;

import EfeitoEspecial.interfaces.EfeitoEspecial;
import Posicao.Posicao;
import Casa.interfaces.Casa;

public class CasaCobra extends Casa {

    public CasaCobra(int numero, Posicao posicao, EfeitoEspecial efeitoEspecial) {
        super(numero, posicao, efeitoEspecial);
    }

    @Override
    public Posicao posicaoEfeito() {
        return this.getEfeitoEspecial().posicaoEfeito();
    }


}
