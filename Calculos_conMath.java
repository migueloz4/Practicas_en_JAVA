
public class Calculos_conMath {
	public static void main (String args[]){
		
		double raiz=Math.sqrt(25); //la clase math contiene metodos, aca use sqrt
		System.out.println(raiz); //raiz cuadrada de un numero 
		
		//utilizo el metodo round
		double num1=5.65;
		float resultado=Math.round(num1); //round redondea numero, devuelve un LONG
		System.out.println(resultado);
		
		//utilizo el metodo pow
		double potencia=Math.pow(5, 2);
		System.out.println(potencia);
		
		//refundicion, transforma un int a int, el sqrt devuelve un double
		//poniendole un (int) hago que devuelva un INT
		int raiz1= (int)Math.sqrt(25);
		System.out.println("el resultado de la raiz de 25 es " + raiz1);
	}
}
