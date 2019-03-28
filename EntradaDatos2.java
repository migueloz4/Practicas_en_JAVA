import javax.swing.*;

public class EntradaDatos2 {
	
	public static void main(String[] args) {
		String usuario1 = JOptionPane.showInputDialog("Introduce tu nombre: ");
		System.out.println("Hola "+usuario1+"¿Como estas?");
		
		String edad1 = JOptionPane.showInputDialog("Introduce tu edad: ");
		System.out.println("Tienes "+edad1+" años.");
		
		System.out.println("cumpliras "+(edad1+1)+" *esto esta mal"); //da mal porque edad es un string y lo cancatena
		//showInputDialog te devuelve un string
		//por eso para transformarlo uso parseInt(edad)
		
		//uso el metodo PARSEINT de la clase INTEGER --> Integer.parseInt
		int edadUsuario=Integer.parseInt(edad1); //para transformar el string EDAD en INT
		System.out.println("cumpliras "+(edadUsuario+1)); //da bien
		
		
	}

}
