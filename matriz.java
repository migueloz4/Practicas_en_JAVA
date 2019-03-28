
public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = new int [2][3];
		
		matrix[0][0]=00;
		matrix[0][1]=01;
		matrix[0][2]=02;
		matrix[1][0]=10;
		matrix[1][1]=11;
		matrix[1][2]=12;
		
		//i para las filas, j para las columnas
		for(int i=0; i<2 ; i++){ 
			System.out.println();
			for(int j=0; j<3; j++){
				System.out.print(matrix[i][j]+" ");
			}
			
		}
		
	}

}
