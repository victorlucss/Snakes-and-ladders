package Tabuleiro;

import Posicao.Posicao;

import java.util.ArrayList;
import java.util.List;

public class ControladorTabuleiro {

	private List<PecaTabuleiro> pecasTabuleiro;

	public ControladorTabuleiro(){
		this.pecasTabuleiro = new ArrayList<>();
	}

	public void adicionarPeca(PecaTabuleiro pecaTabuleiro) {
		this.pecasTabuleiro.add(pecaTabuleiro);
	}

	public List<PecaTabuleiro> getPecasTabuleiro() {
		return pecasTabuleiro;
	}
}
