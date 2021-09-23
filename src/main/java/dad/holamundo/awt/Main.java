package dad.holamundo.awt;

public class Main {

	public static void main(String[] args) {
		MiClase clase = new MiClase();
		clase.saludar("Manolete", "Díaz");
		
//		RubenInterface implementacion = new RubenInterface() {
//			
//			public void saludar(String nombre) {
//				System.out.println("Implementaci�n " + nombre);
//				
//			}
//		};
		
		RubenInterface implementacion = (nombre, ape) -> System.out.println("Buenos días " + nombre);
		implementacion.saludar("Manolo", "Díaz");

	}

}
