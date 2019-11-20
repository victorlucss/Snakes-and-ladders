package Tabuleiro;

public enum ImagemPecaEnum {

    PECA_UM("../Assets/jogadorUm.png", 1),
    PECA_DOIS("../Assets/jogadorDois.png", 2),
    PECA_TRES("../Assets/jogadorTres.png", 3),
    PECA_QUATRO("../Assets/jogadorQuatro.png", 4);

    private String caminho;
    private int peca;

    private ImagemPecaEnum(String caminho, int peca){
        this.caminho = caminho;
        this.peca = peca;
    }

    public static ImagemPecaEnum buscarPecaPorNumero(int pecaBuscada){
        for(ImagemPecaEnum e: values()) {
            if(e.peca == pecaBuscada) return e;
        }

        return PECA_UM;
    }

    public String getCaminho(){
        return this.caminho;
    }

    public int getPeca() {
        return peca;
    }
}
