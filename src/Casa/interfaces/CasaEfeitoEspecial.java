package Casa.interfaces;

import EfeitoEspecial.interfaces.EfeitoEspecial;
import Posicao.Posicao;

public abstract class CasaEfeitoEspecial extends Casa {

    private EfeitoEspecial efeitoEspecial;

    public CasaEfeitoEspecial(int numero, Posicao posicao, EfeitoEspecial efeitoEspecial) {
        super(numero, posicao);
        this.efeitoEspecial = efeitoEspecial;
    }

    public abstract Posicao aplicarEfeito();


}
