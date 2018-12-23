
public class string {

	public static void main(String[] args) {
		String nombre="Miguel";
		System.out.println(nombre);
		
		//para averiguar la longitud de la cadena
		//usando length()
		int longitud=nombre.length();
		System.out.println("la longitud de la palabra es: "+longitud);
		
		//charAt(numero)
		//para averiguar que hay en una posicion
		char letra=nombre.charAt(0); //devuelve M
		System.out.println(letra);
		
		//substring(desde, hasta donde);
		String subcadena=nombre.substring(1); //devuuelve iguel
		System.out.println(subcadena);
		
		//comparar cadenas de caracteres, tiene en cuenta minusc y mayusc
		String cadena1="hola como estas?";
		String cadena2="Hola como estas?";
		System.out.println(cadena1.equals(cadena2)); //devuelve false
		
		//comparar cadenas, sin tener en cuenta minusc y mayusc.
		System.out.println(cadena1.equalsIgnoreCase(cadena2)); //devuelve true
	}

}
