package EfeitoEspecial.concrete;

import EfeitoEspecial.interfaces.Obstaculo;
import Posicao.Posicao;

public class BonusEfeitoEspecial extends Obstaculo {


	public BonusEfeitoEspecial(Posicao posicao) {
		super(posicao);
	}

	@Override
	public Posicao aplicarEfeito() {
		return null;
	}
}
