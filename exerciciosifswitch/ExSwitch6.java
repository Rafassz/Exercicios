package exerciciosifswitch;

import java.util.Scanner;

public class ExSwitch6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int dia;

		System.out.println("Digite um número de 1 a 7, para descobrir a qual dia corresponde: ");
		dia = scanner.nextInt();

		switch (dia) {
		case 1:
			System.out.println("O dia " + dia + " corresponde ao Domingo!! ");
			break;
		case 2:
			System.out.println("O dia " + dia + " corresponde ao Segunda!! ");
			break;
		case 3:
			System.out.println("O dia " + dia + " corresponde ao Terça!! ");
			break;
		case 4:
			System.out.println("O dia " + dia + " corresponde ao Quarta!! ");
			break;
		case 5:
			System.out.println("O dia " + dia + " corresponde ao Quinta!! ");
			break;
		case 6:
			System.out.println("O dia " + dia + " corresponde ao Sexta!! ");
			break;
		case 7:
			System.out.println("O dia " + dia + " corresponde ao Sábado!! ");
			break;
		}

	}

}
