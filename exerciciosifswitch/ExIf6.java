package exerciciosifswitch;

import java.util.Scanner;

public class ExIf6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int idade;
		boolean cidadao;

		System.out.println("Digite sua idade: ");
		idade = scanner.nextInt();
		System.out.println("Você é um Cidadão? [True or False]");
		cidadao = scanner.nextBoolean();

		if (idade >= 18 && cidadao == true) {
			System.out.println("Você pode votar!");
		} else {
			System.out.println("Você não pode votar!");
		}

	}

}
