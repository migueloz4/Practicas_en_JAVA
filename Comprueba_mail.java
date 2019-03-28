import javax.swing.*;
public class Comprueba_mail {

	public static void main(String[] args) {
		boolean arroba=false;
		boolean punto=false;
		String mail=JOptionPane.showInputDialog("Ingrese mail: ");
		int contador=0;
		
		for(int i=0; i<mail.length(); i++) {
			if(mail.charAt(i)=='@'){
				arroba=true;
				contador++;
			}
			if(mail.charAt(i)=='.'){
				punto=true;
			}
		}
		
		if(arroba==true && contador<=1 && punto==true) {
			System.out.println("correcto");
		}
		else{
			System.out.println("incorrecto, cantidad de @: "+contador);	
		}	
		
			
		
	}
}
