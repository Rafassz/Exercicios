package exerciciosifswitch;

import java.util.Scanner;

public class ExSwitch3 {

	public static void main(String[] args) {
		
		int result, opcao, quant;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("########################## TABELA DE PREÇOS ##########################");
		System.out.println("|  Código do Produto   |        Produto       |     Preço Unitário   |");
		System.out.println("|          1           |    Cachorro Quente   |        R$ 10,00      |");
		System.out.println("|          2           |       X-Salada       |        R$ 15,00      |");
		System.out.println("|          3           |        X-Bacon       |        R$ 18,00      |");
		System.out.println("|          4           |         Bauru        |        R$ 12,00      |");
		System.out.println("|          5           |      Refrigerante    |        R$  8,00      |");
		System.out.println("|          6           |    Suco de Laranja   |        R$ 13,00      |");
		System.out.println("######################################################################");
		opcao = leia.nextInt();
		
		System.out.println("\nQual a Quantidade?");
		quant = leia.nextInt();
		
		switch(opcao){
		case 1:
			result = (quant * 10);
			System.out.println("Serão "  + quant + " Cachorro Quente, ficou no valor de : R$ " + result);
			break;

		case 2:
			result = (quant * 15);
			System.out.println("Serão "  + quant + " Cachorro Quente, ficou no valor de : R$ " + result);
			break;


		case 3:
			result = (quant * 18);
			System.out.println("Serão "  + quant + " Cachorro Quente, ficou no valor de : R$ " + result);
			break;
			
		case 4:
			result = (quant * 12);
			System.out.println("Serão "  + quant + " Cachorro Quente, ficou no valor de : R$ " + result);
			break;
			
		case 5:
			result = (quant * 8);
			System.out.println("Serão "  + quant + " Cachorro Quente, ficou no valor de : R$ " + result);
			break;
			
		case 6:
			result = (quant * 13);
			System.out.println("Serão "  + quant + " Cachorro Quente, ficou no valor de : R$ " + result);
			break;
		}
		
	}

}
