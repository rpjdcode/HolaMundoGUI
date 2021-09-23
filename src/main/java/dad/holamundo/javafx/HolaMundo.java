package dad.holamundo.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HolaMundo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Creación de la label de saludo
		Label lab = new Label();
		lab.setText("Aquí saldrá el saludo");
		lab.setLayoutX(20);
		lab.setLayoutY(20);
		
		// Botón
		Button boton = new Button();
		boton.setText("Saludar");
		boton.setLayoutX(20);
		boton.setLayoutY(80);
		boton.setTooltip(new Tooltip("Cuando me pulses saludaré"));
		boton.setOnAction(e -> lab.setText("¡¡¡Hola Mundo!!!"));
		
		// Panel
		Pane panel = new Pane();
		panel.getChildren().addAll(lab, boton);
		
		// Escena
		Scene escena = new Scene(panel, 320, 200);
		
		// en este caso el stage (ventana) no lo creamos nosotros, nos lo da JavaFX
		primaryStage.setTitle("HolaMundo con JavaFX");
		primaryStage.setScene(escena);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
