package Casa.concrete;

import Casa.interfaces.Casa;
import Fabrica.TiposEnum.CasaEnum;
import Fabrica.TiposEnum.EfeitoEspecialEnum;
import Fabrica.concrete.FabricaCasa;
import Fabrica.concrete.FabricaEfeitoEspecial;
import Iterador.concrete.IteradorCasa;
import Iterador.interfaces.IIterador;
import Posicao.Posicao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ControladorCasa {

	private List<Casa> casas;
	private IIterador<Casa> iterador;
	private FabricaCasa fabricaCasa;
	private FabricaEfeitoEspecial fabricaEfeitoEspecial;

	public ControladorCasa(){
		fabricaCasa = new FabricaCasa();
		fabricaEfeitoEspecial = new FabricaEfeitoEspecial();
		casas = new ArrayList<>();
	}

	public void adicionarCasa(Casa casa){
		casas.add(casa);
	}

	public void gerarCasas() {
		//CASAS 01-09
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, Posicao.getPadrao()));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (85), 20 + (88 * 9))));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_BONUS,
				new Posicao(50 + (85 * 2), 20 + (88 * 9)),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.BONUS, Posicao.getPadrao())
				)
		);
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (85 * 3), 20 + (88 * 9))));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_ESCADA,
				new Posicao(50 + (85 * 4), 20 + (88 * 9)),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.OBSTACULO_ESCADA, new Posicao(50 + (86 * 5), 20 + (88 * 6)))
				)
		);
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 5), 20 + (88 * 9))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 6), 20 + (88 * 9))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 7), 20 + (88 * 9))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 8), 20 + (88 * 9))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 9), 20 + (88 * 9))));

		//CASAS 11-20
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 9), 20 + (88 * 8))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 8), 20 + (88 * 8))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 7), 20 + (88 * 8))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 6), 20 + (88 * 8))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 5), 20 + (88 * 8))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 4), 20 + (88 * 8))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 3), 20 + (88 * 8))));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_ESCADA,
				new Posicao(50 + (86 * 2), 20 + (88 * 8)),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.OBSTACULO_ESCADA, new Posicao(50 + 86, 20 + (88 * 6)))
				)
		);
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + 86, 20 + (88 * 8))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50, 20 + (88 * 8))));

		//CASAS 21-30
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50, 20 + (88 * 7))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86), 20 + (88 * 7))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 2), 20 + (88 * 7))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 3), 20 + (88 * 7))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 4), 20 + (88 * 7))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 5), 20 + (88 * 7))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 6), 20 + (88 * 7))));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_BONUS,
				new Posicao(50 + (86 * 7), 20 + (88 * 7)),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.BONUS, Posicao.getPadrao())
		));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 8), 20 + (88 * 7))));

		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_ESCADA,
				new Posicao(50 + (86 * 9), 20 + (88 * 7)),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.OBSTACULO_ESCADA, new Posicao(50 + (86 * 7), 20 + (88 * 4)))
		));

		//CASAS 31-40
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 9), 20 + (88 * 6))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 8), 20 + (88 * 6))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 7), 20 + (88 * 6))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 6), 20 + (88 * 6))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 5), 20 + (88 * 6))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 4), 20 + (88 * 6))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 3), 20 + (88 * 6))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 2), 20 + (88 * 6))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86), 20 + (88 * 6))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50, 20 + (88 * 6))));

		//CASAS 41-50
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 , 20 + (88 * 5))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86), 20 + (88 * 5))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 2), 20 + (88 * 5))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 3), 20 + (88 * 5))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 4), 20 + (88 * 5))));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_BONUS,
				new Posicao(50 + (86 * 5), 20 + (88 * 5)),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.BONUS, Posicao.getPadrao())
		));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 6), 20 + (88 * 5))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 7), 20 + (88 * 5))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 8), 20 + (88 * 5))));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_BONUS,
				new Posicao(50 + (86 * 9), 20 + (88 * 5)),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.BONUS, Posicao.getPadrao())
		));

		//CASAS 51-60
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 9), 20 + (88 * 4))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 8), 20 + (88 * 4))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 7), 20 + (88 * 4))));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_COBRA,
				new Posicao(50 + (86 * 6), 20 + (88 * 4)),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.OBSTACULO_COBRA, new Posicao(50 + (86 * 3), 20 + (88 * 8)))

		));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 5), 20 + (88 * 4))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 4), 20 + (88 * 4))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 3), 20 + (88 * 4))));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_BONUS,
				new Posicao(50 + (86 * 2), 20 + (88 * 4)),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.BONUS, Posicao.getPadrao())
		));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_ESCADA,
				new Posicao(50 + (86), 20 + (88 * 4)),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.OBSTACULO_ESCADA, new Posicao(50 + (86 * 2), 20 + (88)))
		));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50, 20 + (88 * 4))));

		//CASAS 61-70
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 , 20 + (88 * 3))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86), 20 + (88 * 3))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 2), 20 + (88 * 3))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 3), 20 + (88 * 3))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 4), 20 + (88 * 3))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 5), 20 + (88 * 3))));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_ESCADA,
				new Posicao(50 + (86 * 6), 20 + (88 * 3)),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.OBSTACULO_ESCADA, new Posicao(50 + (86 * 8), 20 + (88 * 2)))
		));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 7), 20 + (88 * 3))));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_COBRA,
				new Posicao(50 + (86 * 8), 20 + (88 * 3)),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.OBSTACULO_COBRA, new Posicao(50 + (86 * 6), 20 + (88 * 5)))
		));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_ESCADA,
				new Posicao(50 + (86 * 9), 20 + (88 * 3)),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.OBSTACULO_ESCADA, new Posicao(50 + (86 * 8), 20 + (88)))
		));

		//CASAS 71-80
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 9), 20 + (88 * 2))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 8), 20 + (88 * 2))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 7), 20 + (88 * 2))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 6), 20 + (88 * 2))));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_BONUS,
				new Posicao(50 + (86 * 5), 20 + (88 * 2)),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.BONUS, Posicao.getPadrao())
		));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 4), 20 + (88 * 2))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 3), 20 + (88 * 2))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 2), 20 + (88 * 2))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86), 20 + (88 * 2))));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50, 20 + (88 * 2))));

		//CASAS 81-90
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 , 20 + 88)));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_COBRA,
				new Posicao(50 + (86), 20 + 88),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.OBSTACULO_COBRA, new Posicao(50 + (86), 20 + (88 * 6)))
		));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 2), 20 + 88)));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 3), 20 + 88)));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 4), 20 + 88)));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 5), 20 + 88)));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 6), 20 + 88)));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_BONUS,
				new Posicao(50 + (86 * 7), 20 + 88),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.BONUS, Posicao.getPadrao())
		));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 8), 20 + 88)));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_BONUS,
				new Posicao(50 + (86 * 9), 20 + 88),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.BONUS, Posicao.getPadrao())
		));


		//CASAS 91-100
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 9), 20)));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 8), 20)));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 7), 20)));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 6), 20)));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 5), 20)));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 4), 20)));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86 * 3), 20)));
		adicionarCasa(this.fabricaCasa.criar(
				CasaEnum.CASA_BONUS,
				new Posicao(50 + (86 * 2), 20),
				this.fabricaEfeitoEspecial.criar(EfeitoEspecialEnum.BONUS, Posicao.getPadrao())

		));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_COMUM, new Posicao(50 + (86), 20)));
		adicionarCasa(this.fabricaCasa.criar(CasaEnum.CASA_GANHADORA, new Posicao(50, 20)));

		iterador = new IteradorCasa(this.casas);
	}

	public int getIndiceDaCasaComBaseNaPosicao(Posicao posicao){
		List<Casa> casasComAPosicao = casas.stream().filter(c -> c.getPosicao().compararCom(posicao)).collect(Collectors.toList());

		if(casasComAPosicao.size() > 0){
			Casa casa = casasComAPosicao.get(0);
			if(casa != null) return casa.getNumero()-1;
		}

		return -1;
	}

	public Posicao posicaoProximaCasa(){
		return iterador.proximo().getPosicao();
	}

	public Posicao posicaoCasaAnterior(){
		return iterador.anterior().getPosicao();
	}

	public void indicaIndiceAtualDaCasa(int indiceDaCasaJogador) {
		iterador.setIndiceAtual(indiceDaCasaJogador);
	}

	public Posicao aplicarEfeitoCasaAtual() {
        Casa casa = iterador.atual();
        Posicao posicao = casa.posicaoEfeito();

        return posicao;
	}
}
