package exerciciosifswitch;

import java.util.Scanner;

public class ExIf8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nota;

		System.out.println("Digite sua nota: ");
		nota = scanner.nextInt();

		if (nota >= 90) {
			System.out.println("Sua nota é A. Parabéns!!");
		} else if (nota >= 80 && nota <= 89) {
			System.out.println("Sua nota é B.");
		} else if (nota >= 70 && nota <= 79) {
			System.out.println("Sua nota é C.");
		} else if (nota >= 60 && nota <= 69) {
			System.out.println("Sua nota é D.");
		} else if (nota < 60 && nota >= 0) {
			System.out.println("Sua nota é F. Estude Mais!!");
		}

	}

}
