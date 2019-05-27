package Casa.concrete;

import Casa.interfaces.CasaEfeitoEspecial;
import EfeitoEspecial.interfaces.EfeitoEspecial;
import Posicao.Posicao;

public class CasaBonus extends CasaEfeitoEspecial {

    public CasaBonus(int numero, Posicao posicao, EfeitoEspecial efeitoEspecial) {
        super(numero, posicao, efeitoEspecial);
    }

    @Override
    public Posicao aplicarEfeito() {
        return null;
    }
}
