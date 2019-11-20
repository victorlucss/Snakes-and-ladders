package Tabuleiro;

import javax.swing.*;
import java.awt.*;

public class FronteiraTabuleiro extends JFrame {

    private static FronteiraTabuleiroComponent fronteiraTabuleiroComponent;
    private static FronteiraTabuleiro fronteiraTabuleiro;

    private FronteiraTabuleiro(){
        this.setVisible(true);
        this.setSize(950,1050);
        this.getContentPane().setBackground(Color.decode("#404042"));
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().add(fronteiraTabuleiroComponent);
    }

    public static void trocaTabuleiro(FronteiraTabuleiroComponent tabu){
        fronteiraTabuleiroComponent = tabu;
    }

    //É e não é um Singleton, porque eu só inicio o FronteiraTabuleiro quando eu quero exibir ele na tela
    public static void renderizar(){
        new FronteiraTabuleiro();
    }

    public void apagar() {
        this.setVisible(false);
    }
}
