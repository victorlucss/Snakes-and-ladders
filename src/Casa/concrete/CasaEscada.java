package Casa.concrete;

import Casa.interfaces.CasaEfeitoEspecial;
import EfeitoEspecial.interfaces.EfeitoEspecial;
import Posicao.Posicao;

public class CasaEscada extends CasaEfeitoEspecial {

    public CasaEscada(int numero, Posicao posicao, EfeitoEspecial efeitoEspecial) {
        super(numero, posicao, efeitoEspecial);
    }

    @Override
    public Posicao aplicarEfeito() {
        return null;
    }
}
