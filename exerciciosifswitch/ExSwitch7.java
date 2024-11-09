package exerciciosifswitch;

import java.util.Scanner;

public class ExSwitch7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int idade;
		
		
		System.out.println("Digite sua idade: ");
		idade = scanner.nextInt();
		
		switch(true) {
		case (idade <= 12 && idade > 0):
			System.out.println("Você é uma Criança!!");
			break;
		}

	}

}
