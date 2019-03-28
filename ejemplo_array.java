

public class ejemplo_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double interes=0.10;
		double acumulado;
		
		double matriz[][]=new double[6][5];
		
		for(int i=0; i<6; i++) {
			matriz[i][0]=10000;
			acumulado=10000;
			for(int j=1; j<5; j++){
				acumulado=acumulado+(acumulado*interes);
				matriz[i][j]=acumulado;
			}
		interes=interes+0.01;	
		}
		
		//solo muestra la matriz
		for(int f=0; f<6; f++){
			System.out.println();
			for(int c=0; c<5; c++){
				//System.out.printf("%1.2f",matriz[f][c]);
				//System.out.print(" ");
				System.out.print(matriz[f][c]+"  ");
			}
		}
		
}
}