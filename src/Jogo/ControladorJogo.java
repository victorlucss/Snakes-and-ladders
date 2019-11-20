package Jogo;

import Carta.Carta;
import Carta.ControladorCarta;
import Casa.concrete.*;
import Dado.Dado;
import Jogador.ControladorJogadores;
import Jogador.Jogador;
import Observador.interfaces.Observador;
import Posicao.Posicao;
import Tabuleiro.ControladorTabuleiro;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import Jogador.DadosJogador;
import Tabuleiro.FronteiraTabuleiro;
import Tabuleiro.FronteiraTabuleiroComponent;
import Tabuleiro.PecaTabuleiro;

public class ControladorJogo implements Observador {

	private static ControladorJogo controladorJogo;

    private FronteiraTabuleiro fronteiraTabuleiro;

	private ControladorTabuleiro controladorTabuleiro;
	private ControladorCarta controladorCarta;
	private ControladorCasa controladorCasa;
	private ControladorJogadores controladorJogadores;
	private FronteiraTabuleiroComponent fronteiraTabuleiroComponent;

	private Dado dado;

	private Queue<DadosJogador> filaRenderizarDadosJogadores;

	private QuantosJogadoresFrame quantosJogadoresFrame;
	
	private ControladorJogo(){
		this.filaRenderizarDadosJogadores = new LinkedList<>();
		this.fronteiraTabuleiroComponent = new FronteiraTabuleiroComponent();

		this.controladorCarta = new ControladorCarta();
		this.controladorTabuleiro = new ControladorTabuleiro();
		this.controladorCasa = new ControladorCasa();
		this.controladorCasa.gerarCasas();
		this.quantosJogadoresFrame = new QuantosJogadoresFrame();
		this.controladorJogadores = new ControladorJogadores();
		this.dado = new Dado();
	}

	public static ControladorJogo getInstance(){
		if(controladorJogo == null) controladorJogo = new ControladorJogo();
		return controladorJogo;
	}

	public void iniciar() {
		quantosJogadoresFrame.renderizar();
	}

	public int rolarDado() {
		return dado.rolar();
	}

	public Carta retirarCarta() {
		return controladorJogadores.getJogadorDaVez().retirarCarta(controladorCarta);
	}

	private void movimentarPecaNoTabuleiro(PecaTabuleiro pecaTabuleiro, Posicao novaPosicao) {
		if(novaPosicao != null){
			this.fronteiraTabuleiroComponent.movimentarPecaNoTabuleiro(pecaTabuleiro, novaPosicao);
		}
	}

	public void andarComPeca(int casasAndar) {
		boolean praFrente = casasAndar > 0;

		for (int i = 0; i < Math.abs(casasAndar); i++) {
			Posicao posicaDoJogador = this.controladorJogadores.getPosicaoJogadorDaVez();
			Posicao proximaCasa;

			int indiceDaCasaJogador = this.controladorCasa.getIndiceDaCasaComBaseNaPosicao(posicaDoJogador);

			if(praFrente) {
				this.controladorCasa.indicaIndiceAtualDaCasa(indiceDaCasaJogador + 1);
				proximaCasa = controladorCasa.posicaoProximaCasa();
			}else {
				this.controladorCasa.indicaIndiceAtualDaCasa(indiceDaCasaJogador - 1);
				proximaCasa = controladorCasa.posicaoCasaAnterior();
			}


			this.movimentarPecaNoTabuleiro(controladorJogadores.getJogadorDaVez().getPecaTabuleiro(), proximaCasa);
		}

		this.movimentarPecaNoTabuleiro(controladorJogadores.getJogadorDaVez().getPecaTabuleiro(), this.controladorCasa.aplicarEfeitoCasaAtual());
	}

	public void setQuantidadeJogadores(int quantidade) {
		this.controladorJogadores.setQuantidadeJogadores(quantidade);
	}

	public void passaParaProximaEtapa() {
		quantosJogadoresFrame.apagar();

		for(int i = 0; i < controladorJogadores.getQuantidadeJogadores(); i++){
			this.filaRenderizarDadosJogadores.add(new DadosJogador(i+1));
		}

		DadosJogador visualizarCabeca = this.filaRenderizarDadosJogadores.peek();
		visualizarCabeca.renderizar();
	}

	public void novoJogador(String nome, int numeroJogador){
		Jogador jogador = controladorJogadores.novoJogador(nome, numeroJogador);
		controladorTabuleiro.adicionarPeca(jogador.getPecaTabuleiro());
	}

	@Override
	public void prosseguir() {
		this.filaRenderizarDadosJogadores.remove();
		DadosJogador visualizarCabeca = this.filaRenderizarDadosJogadores.peek();
		if(visualizarCabeca != null){
			visualizarCabeca.renderizar();
		}else {
			iniciarJogo();
		}

	}

	public void iniciarJogo(){
		controladorCasa.gerarCasas();

		controladorJogadores.inicializarIterador();

		controladorCarta.gerarCartas();

		List<PecaTabuleiro> pecasTabuleiro = controladorTabuleiro.getPecasTabuleiro();
		this.fronteiraTabuleiroComponent.setPecasTabuleiro(pecasTabuleiro);
		FronteiraTabuleiro.trocaTabuleiro(this.fronteiraTabuleiroComponent);
		FronteiraTabuleiro.renderizar();

//		ControladorMensagem.getInstance().exibirMensagem("Turno d@ jogador(a) "+controladorJogadores.getJogadorDaVez().getNome());
	}

	public void realizarTurno(){
		int casasParaAndar = rolarDado();

//		ControladorMensagem.getInstance().exibirMensagem(controladorJogadores.getJogadorDaVez().getNome()+" você andará "+casasParaAndar+" casas");

		this.andarComPeca(casasParaAndar);

//		ControladorMensagem.getInstance().exibirMensagem("Fim do turno d@ jogador(a) "+controladorJogadores.getJogadorDaVez().getNome());
		controladorJogadores.proximoJogador();
//		ControladorMensagem.getInstance().exibirMensagem("Turno d@ jogador(a) "+controladorJogadores.getJogadorDaVez().getNome());
	}

	public void encerrarJogo() {
		this.fronteiraTabuleiroComponent.apagar();
	}
}
