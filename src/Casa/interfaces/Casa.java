package Casa.interfaces;

import EfeitoEspecial.interfaces.EfeitoEspecial;
import Posicao.Posicao;

public abstract class Casa {

	private int numero;
	private Posicao posicao;
	private EfeitoEspecial efeitoEspecial;

	public Casa(int numero, Posicao posicao) {
		this.numero = numero;
		this.posicao = posicao;
	}

	public Casa(int numero, Posicao posicao, EfeitoEspecial efeitoEspecial) {
		this.numero = numero;
		this.posicao = posicao;
		this.efeitoEspecial = efeitoEspecial;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	public abstract Posicao posicaoEfeito();

	public EfeitoEspecial getEfeitoEspecial() {
		return efeitoEspecial;
	}

}
