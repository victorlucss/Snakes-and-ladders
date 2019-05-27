package Fabrica.concrete;

import Casa.concrete.CasaBonus;
import Casa.concrete.CasaCobra;
import Casa.concrete.CasaComum;
import Casa.concrete.CasaEscada;
import Casa.interfaces.Casa;
import EfeitoEspecial.interfaces.EfeitoEspecial;
import Fabrica.TiposEnum.CasaEnum;
import Fabrica.interfaces.IFabrica;
import Posicao.Posicao;

public class FabricaCasa implements IFabrica<CasaEnum, Casa, Posicao, EfeitoEspecial> {

	private static int numero = 0;

	@Override
	public Casa criar(CasaEnum tipo, Posicao posicao, EfeitoEspecial efeitoEspecial) {
		Casa casa;

		switch (tipo) {
			case CASA_BONUS:
				casa = new CasaBonus(numero, posicao, efeitoEspecial);

			case CASA_COBRA:
				casa = new CasaCobra(numero, posicao, efeitoEspecial);

			case CASA_ESCADA:
				casa = new CasaEscada(numero, posicao, efeitoEspecial);

			default:
				casa = new CasaComum(numero, posicao);
		}

		return casa;
	}
}
