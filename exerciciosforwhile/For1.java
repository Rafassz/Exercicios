package exerciciosforwhile;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {

		int x, i, par = 0, impar = 0;
		Scanner leia = new Scanner(System.in);
		
		//ENTRADA DE DADOS

		for (i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "ª Número: ");
			x = leia.nextInt();
			if (x % 2 == 0) {
				par++;
			} else if (x % 2 != 0) {
				impar++;
			}
		}

		System.out.println("\nExistem " + par + " Números pares");
		System.out.println("\nExistem " + impar + " Números ímpares");
	}

}
