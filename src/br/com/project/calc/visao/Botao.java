package br.com.project.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton{
	
	public Botao(String texto, Color cor) {
		setText(texto);
		setOpaque(true);
		setForeground(Color.WHITE);
		setBackground(cor);
		setFont(new Font("courier", Font.PLAIN, 25));
	}
 
}
