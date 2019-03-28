import java.util.*;
public class condicionales {

	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("introduce tu edad: ");
		int edad = entrada1.nextInt();
		if (edad<18) {
			System.out.println("eres menor de edad");
		}
		else{
			System.out.println("eres MAYOR de edad");
		}
		entrada1.close();
	}
}
