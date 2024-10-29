package exerciciosifswitch;

import java.util.Scanner;

public class ExIf2 {

	public static void main(String[] args) {

		int idade;
		String nome;

		boolean p1;
		Scanner leia = new Scanner(System.in);

		System.out.println("###################  DOAÇÃO DE SANGUE ###################");
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();

		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();

		System.out.println("Está é sua primeira doação?");
		System.out.println("\n[True para Sim] or [False para Não]");
		p1 = leia.nextBoolean();

		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && p1 == true) {
				System.out.println(nome + " não está ápito para doação de sangue");

			} else {
				System.out.println(nome + " está ápito para doação de sangue");
			}

		}

	}
}