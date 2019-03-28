import java.util.*;

public class EntradaDatos {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		
		String nombre=entrada.nextLine();
		System.out.println("Introduce tu edad: ");
		int edad=entrada.nextInt();
		System.out.println("Hola "+nombre+" tu edad tu proximo cumpleaños sera "+(edad+1));
		entrada.close();
	}

}
