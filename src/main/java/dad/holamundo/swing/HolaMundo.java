package dad.holamundo.swing;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HolaMundo {
	
	public static void main(String[] args) {
		// Label
		JLabel saludoLabel = new JLabel();
		saludoLabel.setText("Aquí saldrá el saludo");
		saludoLabel.setBounds(20, 20, 120, 50);
		
		// Botón
		JButton boton = new JButton();
		boton.setText("Saludar");
		boton.setBounds(20, 80, 120, 30);
		boton.setToolTipText("Como me pulses te saludo");
		boton.addActionListener(e -> saludoLabel.setText("¡¡¡Hola Mundo!!!"));
		
		// Panel (Contenedor)
		JPanel rootPanel = new JPanel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(boton);
		
		// Ventana
		JFrame frame = new JFrame();
		frame.setTitle("Hola Mundo con Swing");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setContentPane(rootPanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

}
