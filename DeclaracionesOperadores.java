
public class DeclaracionesOperadores {

	public static void main(String[] args) {
		int a=5;
		int b=7;
		int c=b+a;
		c++;
		System.out.println(c);
		int resultado=b/a; //esto no va a dar decimal sino redondea a un entero
		System.out.println(resultado);
		int i=0;
	
        while(i++<10){

        if (++i%3!=0) continue;                System.out.print (" El numero es "+i);                }
	}
}