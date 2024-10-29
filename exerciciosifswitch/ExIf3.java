package exerciciosifswitch;

import java.util.Scanner;

public class ExIf3 {

	public static void main(String[] args) {

		String result, cond;
		int numero;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		if (numero % 2 == 0) {
			result = "Par";
		} else {
			result = "ímpar";
		}
		if (numero < 0) {
			cond = "Negativo";
		} else {
			cond = "Positivo";
		}

		System.out.println("Seu Número é " + cond + " e " + result);
	}
}