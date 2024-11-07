package exerciciosifswitch;

import java.util.Scanner;

public class ExIf7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3;

		System.out.println("Digite o 1º Número");
		num1 = scanner.nextInt();
		System.out.println("Digite o 2º Número");
		num2 = scanner.nextInt();
		System.out.println("Digite o 3º Número");
		num3 = scanner.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior número é: " + num1);

		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior número é: " + num2);

		} else if (num3 > num2 && num3 > num1) {
			System.out.println("O maior número é: " + num3);
		}

	}
}
