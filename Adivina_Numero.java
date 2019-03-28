import java.util.*;
public class Adivina_Numero {

	public static void main(String[] args) {
		int aleatorio=(int)(Math.random()*100); //*100 para que el num este de 0 a 100
		
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		int intentos=0;
		
		while(numero!=aleatorio) {
			intentos++;
			System.out.println("Introduce un numero por favor: ");
			numero=entrada.nextInt();
			if(aleatorio<numero) {
				System.out.println("el numero aleatorio mas bajo");
			}
			else if(aleatorio>numero){
				System.out.println("el numero aleatorio mas alto");
			}
		}
		entrada.close();
		System.out.println("Correcto");
		System.out.println("Intentos: "+intentos);
		
	}

}
