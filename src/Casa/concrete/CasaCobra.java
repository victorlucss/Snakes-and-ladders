package Casa.concrete;

import Casa.interfaces.CasaEfeitoEspecial;
import EfeitoEspecial.interfaces.EfeitoEspecial;
import Posicao.Posicao;

public class CasaCobra extends CasaEfeitoEspecial {

    public CasaCobra(int numero, Posicao posicao, EfeitoEspecial efeitoEspecial) {
        super(numero, posicao, efeitoEspecial);
    }

    @Override
    public Posicao aplicarEfeito() {
        return null;
    }

}
