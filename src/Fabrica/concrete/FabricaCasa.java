package Fabrica.concrete;

import Casa.concrete.*;
import Casa.interfaces.Casa;
import EfeitoEspecial.interfaces.EfeitoEspecial;
import Fabrica.TiposEnum.CasaEnum;
import Fabrica.interfaces.IFabrica;
import Posicao.Posicao;

public class FabricaCasa implements IFabrica<CasaEnum, Casa, Posicao, EfeitoEspecial[]> {

	private int numero = 0;

	@Override
	public Casa criar(CasaEnum tipo, Posicao posicao, EfeitoEspecial... efeitoEspecial) {
		Casa casa;

		numero++;

		switch (tipo) {
			case CASA_BONUS:
				return new CasaBonus(numero, posicao, efeitoEspecial[0]);
			case CASA_COBRA:
				return new CasaCobra(numero, posicao, efeitoEspecial[0]);

			case CASA_ESCADA:
				return new CasaEscada(numero, posicao, efeitoEspecial[0]);

			case CASA_GANHADORA:
				return new CasaGanhadora(numero, posicao);

			default:
				return new CasaComum(numero, posicao);
		}


	}
}
