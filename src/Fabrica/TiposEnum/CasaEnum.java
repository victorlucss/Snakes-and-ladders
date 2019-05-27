package Fabrica.TiposEnum;

public enum CasaEnum {
	CASA_COBRA(1),
	CASA_BONUS(2),
	CASA_ESCADA(3),
	CASA_COMUM(4);

	private int tipoCasa;

	CasaEnum(int tipoCasa) {
		this.tipoCasa = tipoCasa;
	}
}
