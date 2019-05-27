package Carta;

public class Carta {

	private String descricao;
	private int efeito;

	public Carta(String descricao, int efeito) {
		this.descricao = descricao;
		this.efeito = efeito;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getEfeito() {
		return efeito;
	}

	public void setEfeito(int efeito) {
		this.efeito = efeito;
	}
}
