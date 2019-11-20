package Carta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ControladorCarta {

	private static ControladorCarta controladorCarta;

	public static ControladorCarta getInstance(){
		if(controladorCarta == null) controladorCarta = new ControladorCarta();

		return controladorCarta;
	}

	private List<Carta> cartas;

	public ControladorCarta() {
		this.cartas = new ArrayList<>();
		this.gerarCartas();
	}

	public Carta sortearCarta() {
		int indiceCartaSorteada = new Random().nextInt(this.cartas.size());

		return this.cartas.get(indiceCartaSorteada);
	}

	public void adicionarCarta(String descricao, int efeito){
		cartas.add(new Carta(descricao, efeito));
	}

	public void gerarCartas(){
		adicionarCarta("Você teve má sorte, volte três casas!", -3);
		adicionarCarta("Você teve má sorte, volte duas casas!", -2);
		adicionarCarta("Você teve má sorte, volte uma casa!", -1);
		adicionarCarta("Você teve boa sorte, avance uma casa!", 1);
		adicionarCarta("Você teve boa sorte, avance duas casas!", 2);
		adicionarCarta("Você teve boa sorte, avance três casas!", 3);
	}

}
