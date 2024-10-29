package exerciciosifswitch;

import java.util.Scanner;

public class ExSwitch2 {

	public static void main(String[] args) {
		
		int n1,n2, opcao, result;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o 1ª Número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o 2ª Número: ");
		n2 = leia.nextInt();
		
		System.out.println("######################  TABELA DE OPERAÇÕES ######################");
		System.out.println("------------------------Digite 1 para Soma------------------------");
		System.out.println("----------------------Digite 2 para Subtração---------------------");
		System.out.println("--------------------Digite 3 para Multiplicação-------------------");
		System.out.println("----------------------Digite 4 para Divisão-----------------------");
		opcao = leia.nextInt();
		
		switch(opcao){
		case 1:
			result = (n1 + n2);
			System.out.println("O resultado da Soma dos 2 Valores é: " + result);
			break;

		case 2:
			result = (n1 - n2);
			System.out.println("O resultado da Subtração dos 2 Valores é: " + result);
			break;
			
		case 3:
			result = (n1 * n2);
			System.out.println("O resultado da Multiplicação dos 2 Valores é: " + result);
			break;
			
		case 4:
			result = (n1 / n2);
			System.out.println("O resultado da Divisão dos 2 Valores é: " + result);
			break;		
			
		default:
    		System.out.println("Opção inválida");
    		break;
		}
		
	}

}
