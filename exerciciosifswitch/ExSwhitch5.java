package exerciciosifswitch;

import java.util.Scanner;

public class ExSwhitch5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcao, num1, num2, resul;

		System.out.println("************************************");
		System.out.println("         CALCULADORA SIMPLES        ");
		System.out.println("************************************");
		System.out.println("           1 - Adição               ");
		System.out.println("           2 - Subtração            ");
		System.out.println("           3 - Multiplicação        ");
		System.out.println("           4 - Divisão              ");
		System.out.println("************************************");

		opcao = scanner.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Digite o 1º Número");
			num1 = scanner.nextInt();
			System.out.println("Digite o 2º Número");
			num2 = scanner.nextInt();

			resul = (num1 + num2);

			System.out.println("O resultado da Soma é: " + resul);
			break;

		case 2:
			System.out.println("Digite o 1º Número");
			num1 = scanner.nextInt();
			System.out.println("Digite o 2º Número");
			num2 = scanner.nextInt();

			resul = (num1 - num2);

			System.out.println("O resultado da Subtração é: " + resul);
			break;
		case 3:
			System.out.println("Digite o 1º Número");
			num1 = scanner.nextInt();
			System.out.println("Digite o 2º Número");
			num2 = scanner.nextInt();

			resul = (num1 * num2);

			System.out.println("O resultado da Multiplicação é: " + resul);
			break;
		case 4:
			System.out.println("Digite o 1º Número");
			num1 = scanner.nextInt();
			System.out.println("Digite o 2º Número");
			num2 = scanner.nextInt();

			resul = (num1 / num2);

			System.out.println("O resultado da Divisão é: " + resul);
			break;

		}

	}
}
