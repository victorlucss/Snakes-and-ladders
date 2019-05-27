package Mensagem;

import javax.swing.*;
import java.awt.*;

public class ControladorMensagem {

	private static ControladorMensagem controladorMensagem;

	public static ControladorMensagem getInstance(){
		if(controladorMensagem == null) controladorMensagem = new ControladorMensagem();

		return controladorMensagem;
	}

	public void exibirMensagem(Component parent, String mensagem) {
		JOptionPane.showMessageDialog(parent, mensagem);


	}

}
