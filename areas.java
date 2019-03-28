import java.util.*;
import javax.swing.*;

public class areas {

	public static void main(String[] args) {
		
		Scanner entrada3 = new Scanner (System.in);
		System.out.println("Elige una opción: \n 1-Cuadrado \n 2-Rectangulo \n 3-Triangulo \n 4-Circulo");
		
		int figura = entrada3.nextInt();
		
		switch(figura){
		case 1: 
			//integer lo uso para pasar de el STRING al INT
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El area del cuadrado es "+Math.pow(lado, 2));	
			break;
	
		case 2: 
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del rectangulo es " + base*altura);
			break;
		case 3: 
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del triangulo es "+( base*altura)/2 );
			break;
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce radio"));
			System.out.print("El area del circulo es ");
			//System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			break;
		default:
			System.out.println("La opcion no es correcta");
		}	
		entrada3.close();
		
			
	}	

}
