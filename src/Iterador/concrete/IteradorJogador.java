package Iterador.concrete;

import Iterador.interfaces.IIterador;
import Jogador.Jogador;

import java.util.List;

public class IteradorJogador implements IIterador<Jogador> {

    private List<Jogador> jogadores;
    private int indiceAtual;

    public IteradorJogador(List<Jogador> jogadores){
        this.jogadores = jogadores;
        indiceAtual = 0;

    }

    @Override
    public Jogador proximo() {
        Jogador jogador;

        if(indiceAtual+1 == jogadores.size()) indiceAtual = 0;
        else indiceAtual++;

        jogador = jogadores.get(indiceAtual);



        return jogador;
    }

    @Override
    public Jogador anterior() {
        Jogador jogador;

        if(indiceAtual-1 >= 0) indiceAtual--;
        jogador = jogadores.get(indiceAtual);

        return jogador;
    }

    public Jogador atual(){
        return jogadores.get(indiceAtual);
    }

    @Override
    public void setIndiceAtual(int indiceAtual) {
        this.indiceAtual = indiceAtual;
    }
}
