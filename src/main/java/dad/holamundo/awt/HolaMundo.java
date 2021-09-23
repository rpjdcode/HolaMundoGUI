package dad.holamundo.awt;

import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Frame;

public class HolaMundo {

	public static void main(String[] args) {
		// Etiqueta
		
		Label saludoLabel = new Label();
		saludoLabel.setText("Aquí saldrá el saludo");
		saludoLabel.setBounds(20, 20, 120, 50);
		
		// Botón
		Button saludarButton = new Button();
		saludarButton.setLabel("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		saludarButton.addActionListener(e -> System.out.println("Hola!!!!"));
		// Panel (Contenedor) que contiene la etiqueta y el botón
		Panel rootPanel = new Panel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(saludarButton);
		
		// Ventana
		Frame frame = new Frame();
		frame.setTitle("Hola Mundo");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(rootPanel);
		frame.setVisible(true);
		
		frame.addWindowsListener(new WindowListener() {
			
		} );
		
	}

}
