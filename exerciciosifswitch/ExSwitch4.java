package exerciciosifswitch;

import java.util.Scanner;

import conta.util.Cores;

public class ExSwitch4 {

	public static void main(String[] args) {

		int opcao, n1;
		float saldo;
		Scanner leia = new Scanner(System.in);

		System.out.println(Cores.ANSI_YELLOW_BACKGROUND +"########## TABELA DE OPERAÇÕES ############");
		System.out.println("   Código da Operação  |      Operação     ");
		System.out.println("           1           |      Saldo        ");
		System.out.println("           2           |      Saque        ");
		System.out.println("           3           |      Depósito     ");
		opcao = leia.nextInt();

		System.out.println("Digite seu saldo: ");
		saldo = leia.nextFloat();

		switch (opcao) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.println("Seu Saldo é de: R$ " + saldo);
			break;

		case 2:
			System.out.println("Operação - Saque");
			System.out.println("Valor do Saque: ");
			n1 = leia.nextInt();

			if (n1 > saldo) {
				System.out.println("Saldo insuficiente");
			} else {
				saldo = (saldo - n1);

				System.out.println("Novo saldo: " + saldo);
			}
			break;

		case 3:
			System.out.println("Operação - Depósito");
			System.out.println("Valor do Depósito: ");
			n1 = leia.nextInt();

			if (n1 > 0) {
				saldo = (saldo + n1);

				System.out.println("Novo saldo: " + saldo);
			} else {
				System.out.println("Não foi possivel fazer o depósito");
			}
			break;

		default:
			System.out.println("Opção inválida");
			break;

		}
	}

}
