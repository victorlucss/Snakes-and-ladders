package Fabrica.interfaces;

public interface IFabrica<T, O, A, B> {
    O criar(T tipo, A x, B y);
}
