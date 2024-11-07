package exerciciosifswitch;

import java.util.Scanner;

public class ExIf5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num;

		System.out.println("Digite um Número:");
		num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println("Seu número é par!");
		} else {
			System.out.println("Seu número é Ímpar!");
		}

	}

}
