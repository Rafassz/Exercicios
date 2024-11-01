package collection;

import java.util.Iterator;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class SetInterator {

	public static void main(String[] args) {

		// Escreva um programa Java para criar uma Collection Set de Objetos da Classe
		// Wrapper Integer.
		// O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores
		// inteiros não repetidos
		// adicione-os individualmente na Collection Set. Em seguida, faça o que se
		// pede:
		// Mostre na tela todos os elementos da Collection Set, utilizando a Classe
		// Iterator.
		// Na construção do Algoritmo, utilize os seguintes conteúdos:
		// Entrada e Saída de dados
		// Collection Set
		// Classe Iterator

		// DECLARAÇÃO DE VARÁVEIS

		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> numeros = new HashSet<Integer>();

		// LAÇO DE REPETIÇÃO
		for (int i = 1; i < 11; i++) {
			System.out.println("Digite o " + i + "º Número: ");
			numeros.add(scanner.nextInt());
		}
		// CLASSE INTERATOR

		Iterator<Integer> valor = numeros.iterator();

		while (valor.hasNext()) {
			System.out.println(valor.next());
		}

	}
}
