import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		String clave="Juan";
		String pass="";
		
		while(clave.equals(pass)==false){
			pass=JOptionPane.showInputDialog("Introduce la contrase�a, por favor");
			
			if(clave.equals(pass)==false){
				System.out.println("Contrase�a incorrecta");
				pass=JOptionPane.showInputDialog("Introduce la contrase�a, por favor");
			}
		}
		System.out.println("��Contrase�a correcta!! ");
	}

}
