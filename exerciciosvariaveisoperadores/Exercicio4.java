package exerciciosvariaveisoperadores;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		int n1, n2, n3, n4, resul;
		Scanner Ler = new Scanner (System.in);
		
		System.out.println("Digite seu 1º Valor: ");
		n1 = Ler.nextInt();
		
		System.out.println("\nDigite seu 2º Valor: ");
		n2 = Ler.nextInt();
		
		System.out.println("\nDigite seu 3º Valor: ");
		n3 = Ler.nextInt();
		
		System.out.println("\nDigite seu 4º Valor: ");
		n4 = Ler.nextInt();
		
		resul = (n1 * n2) - (n3 * n4);
		
		System.out.println("\nCalculo: " + resul );
	}

}
