package Tabuleiro;

import Jogo.ControladorJogo;
import Posicao.Posicao;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.InputStream;

public class FronteiraTabuleiroComponent extends JComponent {



    private JPanel panel;
    private List<PecaTabuleiro> pecasTabuleiro;

    public FronteiraTabuleiroComponent() {

        this.panel = new JPanel();

        this.panel.setLayout(null);
        this.panel.setBackground(Color.decode("#404042"));
        this.panel.add(this);
        this.setBounds(100, 0, 950, 950);

        JButton button = new JButton("Realizar turno!");
        button.setBackground(Color.white);
        button.setBorder(null);
        button.setBounds(30,930,875,50);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ControladorJogo.getInstance().realizarTurno();
            }
        });

        this.add(button);
    }

    public void setPecasTabuleiro(List<PecaTabuleiro> pecasTabuleiro){
        this.pecasTabuleiro = pecasTabuleiro;
    }

    public void movimentarPecaNoTabuleiro(PecaTabuleiro pecaTabuleiro, Posicao posicao) {
        pecasTabuleiro.get(this.pecasTabuleiro.indexOf(pecaTabuleiro)).setPosicao(posicao);
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        try {
            Graphics2D g2 = (Graphics2D) g;
            InputStream imgStream = getClass().getResourceAsStream("../Assets/tabuleiro.png");
            BufferedImage image = ImageIO.read(imgStream);
            g2.drawImage(image, 0,0, panel);

            //As peças se movimentam em X = 50 + (85 * NUMERO DA CASA NA LINHA HORIZONTAL). Por exemplo X = 50 + (85 * 1) para a segunda casa horizontal;
            //As peças se movimentam em Y = 20 + (90 * NUMERO DA CASA NA LINHA VERTICAL). Por exemplo X = 20 + (90 * 1) para a segunda casa vertical;

            for (PecaTabuleiro peca: pecasTabuleiro) {
                if(peca != null){
                    g2.drawImage(peca.recuperarImagemPeca(), peca.getPosicao().getEixoX(), peca.getPosicao().getEixoY(), this);
                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void apagar() {
        this.setVisible(false);
    }
}
