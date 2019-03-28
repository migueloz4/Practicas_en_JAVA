import javax.swing.*;
public class PesoIdeal {

	public static void main(String[] args) {
		String genero="";
		do{
			genero=JOptionPane.showInputDialog("Introduce tu genero(M o F): ");
			
		}while(genero.equalsIgnoreCase("M")==false && genero.equalsIgnoreCase("F")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm: "));
		int peso=0;
		
		if(genero.equalsIgnoreCase("M")){
			peso=altura-110;
		}
		else if(genero.equalsIgnoreCase("F")){
			peso=altura-120;
		}
		System.out.println("Tu peso ideal es "+peso);
		
	}

}
