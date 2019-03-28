import java.util.*;

import javax.swing.JOptionPane;


public class arrayBidimencionales {

	public static void main(String[] args) {
		int nuevaMatriz[][] = new int[2][3];
		
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				nuevaMatriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Introduce valor"));
			}
		}
		
		/*
		for(int i=0; i<2; i++){
			System.out.println();
			for(int j=0; j<3; j++){
				System.out.print(nuevaMatriz[i][j]+" ");
			}
		}
		*/
		//si recorro la matriz con FOR EACH seria asi.. 
		
		for(int []fila : nuevaMatriz){
			System.out.println();
			
			for(int z:fila) {
				System.out.print(z+" ");
			}
		}

	}

}
