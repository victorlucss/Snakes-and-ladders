package Jogador;

import Carta.Carta;
import Carta.ControladorCarta;
import Dado.Dado;
import Tabuleiro.PecaTabuleiro;

public class Jogador {

	private String nome;
	private PecaTabuleiro pecaTabuleiro;

	public Jogador(String nome, PecaTabuleiro pecaTabuleiro) {
		this.nome = nome;
		this.pecaTabuleiro = pecaTabuleiro;
	}


	public int rolarDado(Dado dado) {
		return dado.rolar();
	}

	public Carta retirarCarta(ControladorCarta controladorCarta) {
		return controladorCarta.sortearCarta();
	}

	public String getNome() {
		return nome;
	}

	public PecaTabuleiro getPecaTabuleiro() {
		return pecaTabuleiro;
	}
}
