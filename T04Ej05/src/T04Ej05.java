/*5 Leer una frase por teclado (m�ximo 80 car) y construir otras dos cadenas de forma que una 
contenga los caracteres en posici�n par y la otra los caracteres en posici�n impar. */
import java.util.Scanner;

public class T04Ej05 {

	public static void main(String[] args) {
		int pos;
		final int MAX_LONGITUD = 80;
		Scanner teclado = new Scanner(System.in);
		String frase, cadenaPar="", cadenaImpar="";
		do{
			System.out.println("Frase de hasta "+ MAX_LONGITUD + " caracteres como maximo: ");
			frase = teclado.nextLine();
			System.out.println("");
		}while(frase.length() > MAX_LONGITUD);

		for (pos = 0; pos < frase.length(); pos++){
			if (pos %2 == 0 ) {
				// posicion par:
				cadenaPar = cadenaPar + frase.charAt(pos);
			}
			else {
				// posicion impar:
				cadenaImpar = cadenaImpar + frase.charAt(pos);
			}
		}//for

		System.out.println("La cadena Par es: " + cadenaPar);
		System.out.println("La cadena Impar es: " + cadenaImpar);
	}//main

}//class
