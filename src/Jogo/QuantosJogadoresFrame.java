package Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuantosJogadoresFrame extends JFrame {
    private JPanel panel;
    private JComboBox quantidadeJogadores;
    private JButton comecarJogo;

    public QuantosJogadoresFrame() {
        comecarJogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] quantidadeSplit = quantidadeJogadores.getSelectedItem().toString().split(" ");
                int quantidade = Integer.parseInt(quantidadeSplit[0]);

                ControladorJogo.getInstance().setQuantidadeJogadores(quantidade);
                ControladorJogo.getInstance().passaParaProximaEtapa();
            }
        });
    }

    public void renderizar(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(dim.width/2 - 300, dim.height/2 - 200, 0,0);
        setContentPane(new QuantosJogadoresFrame().panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
    }

    public void apagar() {
        setVisible(false);
    }
}
