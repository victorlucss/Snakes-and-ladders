package Casa.concrete;

import Casa.interfaces.Casa;
import Posicao.Posicao;

public class CasaComum extends Casa {

    public CasaComum(int numero, Posicao posicao) {
        super(numero, posicao);
    }

    @Override
    public Posicao posicaoEfeito() {
        return this.getPosicao();
    }
}
