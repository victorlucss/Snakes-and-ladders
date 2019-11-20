package Fabrica.concrete;

import EfeitoEspecial.concrete.BonusEfeitoEspecial;
import EfeitoEspecial.concrete.CobraEfeitoEspecial;
import EfeitoEspecial.concrete.EscadaEfeitoEspecial;
import EfeitoEspecial.interfaces.EfeitoEspecial;
import Fabrica.TiposEnum.EfeitoEspecialEnum;
import Fabrica.interfaces.IFabrica;
import Posicao.Posicao;

public class FabricaEfeitoEspecial implements IFabrica<EfeitoEspecialEnum, EfeitoEspecial, Posicao, String[]> {

    @Override
    public EfeitoEspecial criar(EfeitoEspecialEnum tipo, Posicao posicaoDepoisDoEfeito, String... args) {
        EfeitoEspecial efeitoEspecial;

        switch (tipo){
            case OBSTACULO_COBRA:
                return new CobraEfeitoEspecial(posicaoDepoisDoEfeito);

            case OBSTACULO_ESCADA:
                return  new EscadaEfeitoEspecial(posicaoDepoisDoEfeito);

            default:
                return new BonusEfeitoEspecial();
        }


    }
}
