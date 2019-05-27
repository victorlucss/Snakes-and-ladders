package Tabuleiro;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;

public class Tabuleiro extends JComponent {

    private String tabuleiroPathUrl;

    JPanel panel;

    public Tabuleiro (String tabuleiroPathUrl) {

        this.tabuleiroPathUrl = tabuleiroPathUrl;

        panel = new JPanel();

        panel.setLayout(null);
        panel.setBackground(Color.decode("#404042"));
        panel.add(this);
        this.setBounds(0, 0, 950, 950);

    }

    @Override
    public void paintComponent(Graphics g) {
        try {
            Graphics2D g2 = (Graphics2D) g;
            InputStream imgStream = getClass().getResourceAsStream(this.tabuleiroPathUrl);
            BufferedImage image = ImageIO.read(imgStream);
            g2.drawImage(image, 0,0, panel);

        }
        catch(Exception e) {
            System.out.println("Imagem do Tabuleiro não localizada!");
        }
    }

}
