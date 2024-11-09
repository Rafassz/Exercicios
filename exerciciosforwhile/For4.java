package exerciciosforwhile;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num;

		System.out.println("Digite um número: ");
		num = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			int resul = (num * i);
			System.out.println(i + " * " + num + "=" + resul);

		}

	}

}
