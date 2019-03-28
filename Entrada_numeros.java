import javax.swing.*;

public class Entrada_numeros {
	
	public static void main (String[] args) {
		
		String num1=JOptionPane.showInputDialog("introduce un numero: ");
		double num2 = Double.parseDouble(num1);
		
		System.out.print("la raiz de "+ num2 + " es "+Math.sqrt(num2));
		//System.out.printf("%1.2f", Math.sqrt(num2));
	}
}
