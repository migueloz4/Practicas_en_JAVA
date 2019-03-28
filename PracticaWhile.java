import java.util.Scanner;


public class PracticaWhile {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("ingrese numero cualquiera: ");
		int num=numero.nextInt();
		while(num<10){
			System.out.println("Iterando:"+num++);
		}
		System.out.println("fin");
		numero.close();

	}

}
