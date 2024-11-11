package exerciciosifswitch;

import java.util.Scanner;

public class ExSwitch8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nota;

		System.out.println("*************************\n");
		System.out.println("   Qual foi a sua Nota?  \n");
		System.out.println("*************************\n");
		System.out.println("           1 - A         ");
		System.out.println("           2 - B         ");
		System.out.println("           3 - C         ");
		System.out.println("           4 - D         ");
		System.out.println("           5 - F         \n");
		System.out.println("*************************");

		nota = scanner.nextInt();

		switch (nota) {
		case 1 -> System.out.println("Excelente");
		case 2 -> System.out.println("Bom");
		case 3 -> System.out.println("Médio");
		case 4 -> System.out.println("Ruim");
		case 5 -> System.out.println("Insuficiente");

		}

	}

}
