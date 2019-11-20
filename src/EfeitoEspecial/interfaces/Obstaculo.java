package EfeitoEspecial.interfaces;

import Posicao.Posicao;

public abstract class Obstaculo {

	private Posicao posicao;

	public Obstaculo(Posicao posicao) {
		this.posicao = posicao;
	}

	public Obstaculo(){}

	public Posicao getPosicao() {return posicao;}

	public void setPosicao(Posicao posicao) {this.posicao = posicao;}

	public void setPosicao(int eixoX, int eixoY) {
		this.posicao.setEixoX(eixoX);
		this.posicao.setEixoY(eixoY);
	}


}
