package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {

		// Escreva um programa Java para criar uma Collection ArrayList de Objetos da
		// Classe String.
		// O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e
		// deverá adicioná-las individualmente no ArrayList.
		// Em seguida, faça o que se pede:*
		// Mostre na tela todas as cores que foram adicionadas.*
		// Mostre na tela todas as cores que foram adicionadas ordenadas em ordem
		// crescente.*
		// Na construção do Algoritmo, utilize os seguintes conteúdos:
		// Entrada e Saída de dados
		// Laços de Repetição
		// Collection ArrayList

		// DECLARAÇÃO DE VARIÁVEIS

		ArrayList<String> cores = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		// ENTRADA DE DADOS E LAÇOS DE REPETIÇÃO

		for (int i = 1; i < 6; i++) {
			System.out.println("Escreva o nome de uma cor: ");
			cores.add(scanner.nextLine());
		}
		System.out.println("Listar todas as cores:");

		for (String cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores);

		System.out.println("\nCores ordenadas:");

		for (String cor : cores) {
			System.out.println(cor);
		}

	}

}
