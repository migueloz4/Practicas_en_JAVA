import javax.swing.*;
public class ForEach {

	public static void main(String[] args) {
		String paises[] = new String[4];
		
		/*
		paises[0]="España";
		paises[1]="Argentina";
		paises[2]="Colombia";
		paises[3]="Venezuela";
		*/
		
		/*
		for(int i=0; i<paises.length; i++){
			System.outprintln(paises[i])
		}
		*/
		
		//AHORA USO FOR EACH 
		
		
		for(int i=0; i<4; i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce pais: ");
			
		}
		
		
		for(String elemento:paises){
			System.out.println(elemento);
			
		}
	}

}
