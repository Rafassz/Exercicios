package collection;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {

		// Escreva um programa Java para criar uma Collection ArrayList de Objetos da
		// Classe Wrapper Integer,
		// inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário,
		// que ele digite via teclado 1 número inteiro
		// e caso ele seja encontrado no ArrayList, exiba na tela a posição deste número
		// na Collection.
		// Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O
		// número NN não foi encontrado!
		// Na construção do Algoritmo, utilize os seguintes conteúdos:

		// Entrada e Saída de dados
		// Laços Condicionais
		// Laços de Repetição
		// Collection ArrayList

		// DECLARAÇÃO DE VARIÁVEIS

		int num;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		// LAÇO DE REPETIÇÃO	// ENTRADA DE DADOS
		for (int i = 1; i < 11; i++) {
			System.out.println("Digite o " + i + "º Número: ");
			numeros.add(scanner.nextInt());
		}

		System.out.println("Digite o número do qual você quer descobrir a posição: ");
		num = scanner.nextInt();

		// LAÇO CONDICIONAL
		if (numeros.contains(num)) {
			System.out.println("O número 7 está localizado na posição: " + numeros.indexOf(num));
		} else {
			System.out.println("O número" + num + " não foi encontrado!");
		}

	}

}
