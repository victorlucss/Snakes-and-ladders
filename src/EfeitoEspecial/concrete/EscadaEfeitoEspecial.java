package EfeitoEspecial.concrete;

import EfeitoEspecial.interfaces.Obstaculo;
import EfeitoEspecial.interfaces.EfeitoEspecial;
import Mensagem.ControladorMensagem;
import Posicao.Posicao;
import Tabuleiro.PecaTabuleiro;

public class EscadaEfeitoEspecial extends Obstaculo implements EfeitoEspecial {

    public EscadaEfeitoEspecial(Posicao posicao) {
        super(posicao);
    }

    @Override
    public Posicao posicaoEfeito() {
        ControladorMensagem.getInstance().exibirMensagem("Você parou em uma escada, vamos subir!");
        return this.getPosicao();
    }
}
