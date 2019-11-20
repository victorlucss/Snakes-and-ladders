package Jogador;

import Iterador.concrete.IteradorJogador;
import Iterador.interfaces.IIterador;
import Posicao.Posicao;
import Tabuleiro.ImagemPecaEnum;
import Tabuleiro.PecaTabuleiro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ControladorJogadores {

	private int quantidadeJogadores;

	private List<Jogador> jogadores;
	private IIterador<Jogador> iterador;

	public ControladorJogadores(){
		jogadores = new ArrayList<>();
	}

	public void inicializarIterador() {
		iterador = new IteradorJogador(jogadores);
	}

	public Jogador novoJogador(String nome, int numeroJogador) {
		PecaTabuleiro pecaTabuleiro = new PecaTabuleiro(ImagemPecaEnum.buscarPecaPorNumero(numeroJogador));
		Jogador jogador = new Jogador(nome, pecaTabuleiro);
		this.jogadores.add(jogador);

		return jogador;
	}

    public void setQuantidadeJogadores(int quantidade) {
		this.quantidadeJogadores = quantidade;
    }

	public int getQuantidadeJogadores() {
		return this.quantidadeJogadores;
	}

	public Jogador getJogadorDaVez() {
		return iterador.atual();
	}

	public void proximoJogador(){
		iterador.proximo();
	}

	public List<PecaTabuleiro> getPecasJogadores(){
		return this.jogadores.stream().map(jog -> jog.getPecaTabuleiro()).collect(Collectors.toList());
	}

	public Posicao getPosicaoJogadorDaVez(){
		return iterador.atual().getPecaTabuleiro().getPosicao();
	}
}
