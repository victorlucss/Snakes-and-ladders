package Fabrica.concrete;

import EfeitoEspecial.concrete.BonusEfeitoEspecial;
import EfeitoEspecial.concrete.CobraEfeitoEspecial;
import EfeitoEspecial.concrete.EscadaEfeitoEspecial;
import EfeitoEspecial.interfaces.EfeitoEspecial;
import Fabrica.TiposEnum.EfeitoEspecialEnum;
import Fabrica.interfaces.IFabrica;
import Posicao.Posicao;

public class FabricaEfeitoEspecial implements IFabrica<EfeitoEspecialEnum, EfeitoEspecial, Integer, Integer> {

    @Override
    public EfeitoEspecial criar(EfeitoEspecialEnum tipo, Integer eixoX, Integer eixoY) {
        Posicao posicao = new Posicao(eixoX, eixoY);
        EfeitoEspecial efeitoEspecial;

        switch (tipo){
            case OBSTACULO_COBRA:
                efeitoEspecial = new CobraEfeitoEspecial(posicao);

            case OBSTACULO_ESCADA:
                efeitoEspecial = new EscadaEfeitoEspecial(posicao);

            default:
                efeitoEspecial = new BonusEfeitoEspecial(posicao);
        }

        return efeitoEspecial;
    }
}
