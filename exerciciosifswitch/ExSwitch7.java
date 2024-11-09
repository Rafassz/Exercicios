package exerciciosifswitch;

import java.util.Scanner;

public class ExSwitch7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int idade, x = 0;

		System.out.println("Digite sua idade: ");
		idade = scanner.nextInt();
		if (idade > 0 && idade<= 12) {
			x = 1;
		}else if(idade > 12 && idade <= 20) {
			x = 2;
		}else if(idade > 20 && idade <= 59) {
			x = 3;
		}else if(idade >= 60) {
			x = 4;
		}

		switch (x) {
		case 1:
			System.out.println("Criança");
			break;
		case 2:
			System.out.println("Adolescente");
			break;
		case 3:
			System.out.println("Adulto");
			break;
		case 4:
			System.out.println("Idoso");
			break;
		}

	}

}
