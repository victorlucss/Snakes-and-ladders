package Posicao;

public class Posicao {

    private int eixoX;
    private int eixoY;

    public Posicao(int eixoX, int eixoY) {
        this.eixoX = eixoX;
        this.eixoY = eixoY;
    }

    public Posicao(){
        this.eixoX = 50;
        this.eixoY = 20 + (88 * 9);
    }

    public int getEixoX() {
        return eixoX;
    }

    public void setEixoX(int eixoX) {
        this.eixoX = eixoX;
    }

    public int getEixoY() {
        return eixoY;
    }

    public void setEixoY(int eixoY) {
        this.eixoY = eixoY;
    }

    public static Posicao getPadrao(){
        return new Posicao();
    }

    public boolean compararCom(Posicao posicao){
        return this.getEixoX() == posicao.getEixoX() && this.getEixoY() == posicao.getEixoY();
    }

    @Override
    public String toString() {
        return "Posicao{" +
                "eixoX=" + eixoX +
                ", eixoY=" + eixoY +
                '}';
    }
}
