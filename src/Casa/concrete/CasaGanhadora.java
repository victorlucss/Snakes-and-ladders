package Casa.concrete;

import Casa.interfaces.Casa;
import Jogo.ControladorJogo;
import Mensagem.ControladorMensagem;
import Posicao.Posicao;

public class CasaGanhadora extends Casa {

    public CasaGanhadora(int numero, Posicao posicao) {
        super(numero, posicao);
    }

    @Override
    public Posicao posicaoEfeito() {
        ControladorMensagem.getInstance().exibirMensagem("Parabéns, você ganhou o jogo!");
        ControladorJogo.getInstance().encerrarJogo();
        return this.getPosicao();
    }
}
