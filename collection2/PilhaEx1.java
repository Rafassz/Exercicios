package collection2;

import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class PilhaEx1 {

	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS

		Stack<String> pilha = new Stack<String>();
		Scanner scanner = new Scanner(System.in);
		int opcao = 1;
		String nome;

		do {
			System.out.println("***********************************************");
			System.out.println("\n         1 - Adicionar Livro na Pilha         ");
			System.out.println("         2 - Listar Todos os Livros         ");
			System.out.println("         3 - Retirar Livros da Pilha         ");
			System.out.println("         0 - Sair            ");
			System.out.println("\n***********************************************");
			System.out.println("Entre com a Opção desejada: ");
			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite o Nome do Livro: ");
				scanner.skip("\\R?");
				nome = scanner.nextLine();
				pilha.push(nome);
				System.out.println("Livro Adicionado com Sucesso!! ");

				break;

			case 2:

				if (pilha.isEmpty()) {
					System.out.println("Pilha Vazia!! ");
				} else {
					System.out.println("Lista de Livros na Pilha: ");
					Iterator<String> iterator = pilha.iterator();
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
				}
				break;

			case 3:

				if (pilha.isEmpty()) {
					System.out.println("Pilha vazia.");
				} else {
					System.out.println(pilha.pop() + " Retirado da Pilha.");
				}

				break;

			}
		} while (opcao != 0);

		System.out.println("O Programa foi Finalizado.");
	}

}
