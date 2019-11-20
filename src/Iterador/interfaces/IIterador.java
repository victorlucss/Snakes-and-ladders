package Iterador.interfaces;

public interface IIterador<T> {

	T proximo();
	T anterior();
	T atual();
	void setIndiceAtual(int x);
}
