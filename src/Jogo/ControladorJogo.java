package Jogo;

import Jogador.Jogador;
import Mensagem.ControladorMensagem;

public class ControladorJogo {

	private static ControladorJogo controladorJogo;

	public static ControladorJogo getInstance(){
		if(controladorJogo == null) controladorJogo = new ControladorJogo();
		return controladorJogo;
	}



	public void renderizarCasas() {

	}

	public void iniciar() {
		ControladorMensagem.getInstance().exibirMensagem(null, "OI");
	}

	public void rolarDado() {

	}

	public void mudarJogadorDeLugar(Jogador jogador, int lugar) {

	}

	public void retirarCarta() {

	}

	public void aplicarEfeito() {

	}

	public void renderizarJogadores() {

	}

}
