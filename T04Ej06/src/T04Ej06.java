/*6 Leer una frase por teclado (m�ximo 80) y a continuaci�n escribir cuantas vocales, 
consonantes y caracteres num�ricos posee.  */

import java.util.Scanner;
public class T04Ej06 {

	public static void main(String[] args) {
		final int MAX_LONGITUD = 80;
		Scanner teclado = new Scanner(System.in);
		String frase, contavocales ="", contaconsonantes = "", contanum = "";
		do{
			System.out.println("Frase de hasta "+ MAX_LONGITUD + " caracteres como maximo: ");
			frase = teclado.nextLine();
			System.out.println("");
		}while(frase.length() > MAX_LONGITUD);

	}//main

}//class
