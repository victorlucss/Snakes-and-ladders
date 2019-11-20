package Tabuleiro;

import Jogador.Jogador;
import Posicao.Posicao;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.InputStream;

public class PecaTabuleiro {
    private Posicao posicao;
    private String imagemDaPeca;

    public PecaTabuleiro(Posicao posicao, String imagemDaPeca){
        this.posicao = posicao;
        this.imagemDaPeca = imagemDaPeca;
    }

    public PecaTabuleiro(ImagemPecaEnum imagemPecaEnum){
        this.posicao = Posicao.getPadrao();
        this.imagemDaPeca = imagemPecaEnum.getCaminho();
    }

   public Image recuperarImagemPeca(){
       try {

           InputStream imgStream = getClass().getResourceAsStream(this.imagemDaPeca);
           Image imagem = ImageIO.read(imgStream);
            return imagem;
       } catch(Exception e) {
           System.out.println("Imagem da peça não localizada!");
           return null;
       }
   }

   public Posicao getPosicao(){
        return this.posicao;
   }

    public void setPosicao(Posicao posicao){
        this.posicao = posicao;
    }

}
