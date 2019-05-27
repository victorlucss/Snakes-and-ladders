package Tabuleiro;

import Posicao.Posicao;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;

public class PecaTabuleiro extends JComponent {

    Posicao posicao;
    JPanel panel;

    public PecaTabuleiro(Posicao posicao){
        this.posicao = posicao;
    }

    public void setPosicao(Posicao novaPosicao){
        this.posicao = novaPosicao;
    }

    @Override
    protected void paintComponent(Graphics g) {
        try {
            Graphics2D g2 = (Graphics2D) g;
            InputStream imgStream = getClass().getResourceAsStream("../Assets/jogadorDois.png");
            BufferedImage image = ImageIO.read(imgStream);
            g2.drawImage(image, 45,810, panel);

        }
        catch(Exception e) {
            System.out.println("Imagem do jogador não localizada!");
        }
    }


}
