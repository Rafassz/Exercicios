package exerciciosvariaveisoperadores;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int n1,n2,n3,n4, media;
		Scanner Ler = new Scanner (System.in);
		
		System.out.println("Digite sua 1º Nota: ");
		n1 = Ler.nextInt();
		
		System.out.println("\nDigite sua 2º Nota: ");
		n2 = Ler.nextInt();
		
		System.out.println("\nDigite sua 3º Nota: ");
		n3 = Ler.nextInt();
		
		System.out.println("\nDigite sua 4º Nota: ");
		n4 = Ler.nextInt();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		System.out.println("\nSua Média é: " + media );
		

	}

}
