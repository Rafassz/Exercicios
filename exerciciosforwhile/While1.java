package exerciciosforwhile;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIAVEIS//

		Scanner scanner = new Scanner(System.in);
		int idade = 0, menor = 0, maior = 0;

		// LOOP DE ENTRADA DE DADOS//

		while (idade >= 0) {
			System.out.println("-------Digite uma idade-------");
			idade = scanner.nextInt();
			if (idade < 21 && idade > 0) {
				menor++;
			} else if (idade > 50) {
				maior++;

			}
		}

		// SOMA//

		System.out.println("_______________________________________");
		System.out.println(" Total de menores de 21 anos: " + (menor));
		System.out.println("|______________________________________|");
		System.out.println(" Total de maiores de 50 anos: " + maior);
		System.out.println("|______________________________________|");
	}

}
