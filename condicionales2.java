import java.util.Scanner;
public class condicionales2 {

	public static void main(String[] args) {
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("introduce tu edad: ");
		int edad = entrada2.nextInt();
		
		if (edad<18) {
			System.out.println("eres menor de edad");
		}
		else if (edad<40) {
			System.out.println("eres joven");
		}
		else{
			System.out.println("eres grande");
		}
		entrada2.close();
		
	}
}	
	
