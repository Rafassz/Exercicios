package exerciciosforwhile;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIAVEIS*//

		Scanner scanner = new Scanner(System.in);
		int n, resul = 0;

		do {
			System.out.println("Digite um número: ");
			n = scanner.nextInt();
			if (n > 0) {
				resul = resul + n;
			}
		} while (n != 0);

		System.out.println("A soma dos Números positivos é: " + resul);

	}
}
