package exerciciosifswitch;

import java.util.Scanner;

public class Exif4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int idade;

		System.out.println("Digite sua idade: ");
		idade = scanner.nextInt();

		if (idade >= 18) {
			System.out.println("Você é maior de idade!");
		} else if (idade < 18 && idade > 0) {
			System.out.println("Você é menor de idade!");
		}

	}

}
