package exerciciosvariaveisoperadores;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		int salario, abono, resul;
		Scanner Ler = new Scanner (System.in);
		
		System.out.println("Digite seu salário: ");
		salario = Ler.nextInt();
		
		System.out.println("\nDigite seu abono: ");
		abono = Ler.nextInt();
		
		resul = salario + abono;
		
		System.out.println("\nNovo salário: " + resul );
		
		
	}

}
