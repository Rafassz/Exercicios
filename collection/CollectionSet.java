package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionSet {

	public static void main(String[] args) {

		// Escreva um programa Java para criar uma Collection Set de Objetos da Classe
		// Wrapper Integer,
		// inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário,
		// que ele digite via teclado 1 número inteiro e caso ele seja encontrado no
		// Set,
		// exiba na tela a mensagem: Número 00 Encontrado! Caso o número não seja
		// encontrado,
		// ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
		// Na construção do Algoritmo, utilize os seguintes conteúdos:
		// Entrada e Saída de dados
		// Laços Condicionais
		// Laços de Repetição
		// Collection Set

		// DECLARAÇÃO DE VARIÁVEIS
		int num;
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> numeros = new HashSet<Integer>();
		Collections.addAll(numeros, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);
		
		// ENTRADA DE DADOS

		System.out.println("Digite o número do qual você quer encontrar: ");
		num = scanner.nextInt();

		if (numeros.contains(num)) {
			System.out.println("O número " + num + " foi encontrado!");
		} else {
			System.out.println("O número " + num + "  não foi encontrado!");
		}

	}
}
