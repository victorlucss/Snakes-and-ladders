package Jogador;

import Jogo.ControladorJogo;
import Observador.interfaces.Observavel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DadosJogador extends JFrame implements Observavel {
    private JButton button1;
    private JTextField nomeJogador;
    private JLabel labelNumeroJogador;
    private JPanel panel;

    public DadosJogador(int indiceJogador){
        labelNumeroJogador.setText("Dados do jogador "+indiceJogador);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorJogo.getInstance().novoJogador(nomeJogador.getText().toString(), indiceJogador);
                apagar();
            }
        });
    }

    private void createUIComponents() {

    }

    public void renderizar() {

        setContentPane(this.panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setResizable(false);
    }

    protected void apagar(){
        this.notifique();
        setVisible(false);
    }

    @Override
    public void notifique() {
        ControladorJogo.getInstance().prosseguir();
    }
}
