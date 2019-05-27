package Tabuleiro;

import Posicao.Posicao;

import javax.swing.*;

public class Tabu extends JComponent {

    private Tabuleiro tabuleiro;

    JFrame frame;

    public Tabu(){
        frame = new JFrame("Cobras e Escadas - Jogo");
        frame.setVisible(true);
        frame.setSize(950,975);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.getContentPane().add(new PecaTabuleiro(new Posicao(0,0)));
        frame.getContentPane().add(new Tabuleiro("../Assets/tabuleiro.png"));

    }



    public static void main(String[] args) {
        new Tabu();
    }
}
