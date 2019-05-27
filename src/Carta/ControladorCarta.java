package Carta;

import java.util.List;

public class ControladorCarta {

	private List<Carta> cartas;

	public ControladorCarta(List<Carta> cartas) {
		this.cartas = cartas;
	}

	public Carta sortearCarta() {
		return null;
	}

	public void adicionarCarta(String descricao, int efeito){
		cartas.add(new Carta(descricao, efeito));
	}

}
