package EfeitoEspecial.concrete;

import Carta.Carta;
import Carta.ControladorCarta;
import Casa.concrete.ControladorCasa;
import EfeitoEspecial.interfaces.EfeitoEspecial;
import EfeitoEspecial.interfaces.Obstaculo;
import Jogo.ControladorJogo;
import Mensagem.ControladorMensagem;
import Posicao.Posicao;
import Tabuleiro.PecaTabuleiro;

public class BonusEfeitoEspecial extends Obstaculo implements EfeitoEspecial {

	public BonusEfeitoEspecial() {
		super();
	}

	@Override
	public Posicao posicaoEfeito() {
		ControladorMensagem.getInstance().exibirMensagem("Você parou em uma casa bonus, vamos testar sua sorte!");
		Carta cartaSorteada = ControladorJogo.getInstance().retirarCarta();

		ControladorMensagem.getInstance().exibirMensagem(cartaSorteada.getDescricao());
		ControladorJogo.getInstance().andarComPeca(cartaSorteada.getEfeito());

		return this.getPosicao();
	}
}
