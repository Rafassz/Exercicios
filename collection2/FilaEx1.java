package collection2;

import java.util.Queue;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class FilaEx1 {

	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS

		Queue<String> fila = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		int opcao = 1;
		String nome;

		do {
			System.out.println("***********************************************");
			System.out.println("\n         1 - Adicionar Cliente na Fila         ");
			System.out.println("         2 - Listar Todos os Clientes         ");
			System.out.println("         3 - Retirar Cliente da Fila         ");
			System.out.println("         0 - Sair            ");
			System.out.println("\n***********************************************");
			System.out.println("Entre com a Opção desejada: ");
			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite o Nome do Cliente: ");
				scanner.skip("\\R?");
				nome = scanner.nextLine();
				fila.add(nome);
				System.out.println("Cliente Adicionado com Sucesso!! ");

				break;

			case 2:

				if (fila.isEmpty()) {
					System.out.println("Lista Vazia!! ");
				} else {
					System.out.println("Lista de Clientes na Fila: ");
					Iterator<String> iterator = fila.iterator();
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
				}

				break;

			case 3:
				if(fila.isEmpty()) {
					System.out.println("Fila vazia");
				}else {
				System.out.println(fila.remove() + " Comparecer ao caixa!");
				}
				break;
			}
		} while (opcao != 0);
		
		System.out.println("O Programa foi Finalizado.");
	}
}
