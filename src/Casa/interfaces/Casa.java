package Casa.interfaces;

import Posicao.Posicao;

public abstract class Casa {

	private int numero;
	private Posicao posicao;

	public Casa(int numero, Posicao posicao) {
		this.numero = numero;
		this.posicao = posicao;
	}
}
