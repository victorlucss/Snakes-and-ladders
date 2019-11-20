package EfeitoEspecial.concrete;

import EfeitoEspecial.interfaces.EfeitoEspecial;
import EfeitoEspecial.interfaces.Obstaculo;
import Mensagem.ControladorMensagem;
import Posicao.Posicao;
import Tabuleiro.PecaTabuleiro;

public class CobraEfeitoEspecial extends Obstaculo implements EfeitoEspecial {

    public CobraEfeitoEspecial(Posicao posicao) {
        super(posicao);
    }

    @Override
    public Posicao posicaoEfeito() {
        ControladorMensagem.getInstance().exibirMensagem("Você parou em uma cobra, vamos descer!");
        return this.getPosicao();

    }
}
