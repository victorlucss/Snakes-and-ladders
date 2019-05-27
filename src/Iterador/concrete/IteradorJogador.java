package Iterador.concrete;

import Iterador.interfaces.IIterador;
import Jogador.ControladorJogador;
import Jogador.Jogador;

import java.util.List;


public class IteradorJogador implements IIterador {

	private ControladorJogador controladorJogador;

	public IteradorJogador(List<Jogador> jogadores) {

	}

	public Jogador proximo() {
		return null;
	}

}
