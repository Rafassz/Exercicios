package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {
		// DECLARAÇÃO DE VARIÁVEIS//

		int num, valor = -1;
		int vetnum[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número que você deseja encontrar: ");
		num = scanner.nextInt();

		for (int i = 0; i < vetnum.length; i++) {
			if (vetnum[i] == num) {
				valor = i;
			}
		}
		if (valor != -1) {
			System.out.println("Número " + num + " encontrado na posição " + (valor));
		} else {
			System.out.println("Valor não encontrado");
		}
	}

}
