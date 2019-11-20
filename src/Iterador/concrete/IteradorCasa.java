package Iterador.concrete;

import Casa.concrete.CasaComum;
import Casa.concrete.CasaGanhadora;
import Casa.interfaces.Casa;
import Iterador.interfaces.IIterador;

import java.util.List;

public class IteradorCasa implements IIterador<Casa> {

    private List<Casa> casas;
    private int indiceAtual;

    public IteradorCasa(List<Casa> casas){
        this.casas = casas;
        this.indiceAtual = 0;
    }

    @Override
    public Casa proximo() {
        Casa casa = atual();

        if (this.casas.contains(this.indiceAtual + 1)) casa = this.casas.get(this.indiceAtual + 1);


        return casa;
    }

    @Override
    public Casa anterior() {
        Casa casa = this.casas.get(this.indiceAtual);


        return casa;
    }

    @Override
    public Casa atual() {
        return casas.get(indiceAtual);
    }

    @Override
    public void setIndiceAtual(int indiceAtual) {
        if(indiceAtual > 0) this.indiceAtual = indiceAtual;
    }

}
