package abstrata.principal;

/* Aluna: Maize Rodrigues dos Santos
 */

import java.util.Scanner;

import abstrata.Circulo;
import abstrata.Quadrado;

public class Principal {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		Quadrado quadrado = new Quadrado();

		Scanner input = new Scanner(System.in);
		System.out.println("Qual é o lado do quadrado?");
		quadrado.setLado(input.nextFloat());
	
		System.out.println("Qual é o raio do circulo?");
		circulo.setRaio(input.nextFloat());
		
		float aq = quadrado.area();
		System.out.println("O valor da área do quadrado é " + aq);

		System.out.println("O valor da área do circulo é " + circulo.area());

	}

}
