package exerciciosforwhile;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS//

		int num1, num2, i;
		Scanner scanner = new Scanner(System.in);

		// ENTRADA DE DADOS*//

		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = scanner.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		num2 = scanner.nextInt();

		// LAÇOS CONDICIONAIS//

		if (num1 > num2) {
			System.out.println("Intervalo inválido");
		} else {
			for (i = num1; i < num2; i++) {
				if (i % 5 == 0 && i % 3 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}

		}

	}
}
