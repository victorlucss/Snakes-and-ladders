package Casa.concrete;

import Casa.interfaces.Casa;
import Fabrica.TiposEnum.CasaEnum;
import Fabrica.concrete.FabricaCasa;

import java.util.List;

public class ControladorCasa {

	private List<Casa> casas;
	private FabricaCasa fabricaCasa;

	public ControladorCasa(){
		fabricaCasa = new FabricaCasa();
	}

	public List<Casa> gerarCasas() {







		return casas;

	}

}
