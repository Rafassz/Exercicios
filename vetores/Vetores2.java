package vetores;

import java.util.Scanner;

import java.util.Arrays;

public class Vetores2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int vetnum[] = new int[10];
		int num, i = 0;
		float media, soma = 0;
		String guardari = " ", guardarp = "";

		for (i = 0; i < vetnum.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor");
			vetnum[i] = scanner.nextInt();

		}
		for (i = 1; i < vetnum.length; i += 2) {
			guardari += vetnum[i];
		}

		for (i = 0; i < vetnum.length; i++) {
			if (vetnum[i] % 2 == 0) {
				guardarp += vetnum[i];
			}
		}
		for (i = 0; i < vetnum.length; i++) {
			soma = (soma + vetnum[i]);
		}
		media = (soma / 10);

		System.out.println("Elementos nos índices ímpares:" + guardari);
		System.out.println("Elementos pares: " + guardarp);
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}
}
