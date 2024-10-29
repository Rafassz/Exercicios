package exerciciosifswitch;

import java.util.Scanner;

public class ExSwitch1 {
	
	public static void main(String[] args) {
		
		String nome;
		int  opcao;
		float salario;
		Scanner leia = new Scanner (System.in);
			
		System.out.println("##################### REAJUSTE SALARIAL #####################");
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite seu Salário ");
		salario = leia.nextFloat();
		
		System.out.println("--Digite 1 se seu cargo for Gerente--");
        System.out.println("--Digite 2 se seu cargo for Vendedor--");
        System.out.println("--Digite 3 se seu cargo for Supervisor--");
        System.out.println("--Digite 4 se seu cargo for Motorista--");
        System.out.println("--Digite 5 se seu cargo for Estoquista");
        System.out.println("--Digite 6 se seu cargo for Técnico de TI");
        opcao = leia.nextInt();
        
        switch(opcao) {
        case 1:
        	salario = salario +( 10 * salario)/100; 
        	System.out.println("Nome do colaborador: " + nome);
        	System.out.println("\nCargo: Gerente");
        	System.out.println("\nNovo Salário: " + salario);
        	break;
        
        case 2:
        	salario = salario +( 7 * salario)/100; 
        	System.out.println("Nome do colaborador: " + nome);
        	System.out.println("\nCargo:Vendedor");
        	System.out.println("\nNovo Salário: " + salario);
        	break;
        
        case 3:
        	salario = salario +( 9 * salario)/100; 
        	System.out.println("Nome do colaborador: " + nome);
        	System.out.println("\nCargo: Supervisor");
        	System.out.println("\nNovo Salário: " + salario);
        	break;
        	
        case 4:
        	salario = salario +( 6 * salario)/100; 
        	System.out.println("Nome do colaborador: " + nome);
        	System.out.println("\nCargo: Motorista");
        	System.out.println("\nNovo Salário: " + salario );
        	break;
        	
        case 5:
        	salario = salario +( 5 * salario)/100; 
        	System.out.println("Nome do colaborador: " + nome);
        	System.out.println("\nCargo: Estoquista");
        	System.out.println("\nNovo Salário: " + salario);
        	break;
        
        case 6:
        	salario = salario +( 8 * salario)/100; 
        	System.out.println("Nome do colaborador: " + nome);
        	System.out.println("\nCargo: Técnico de TI");
        	System.out.println("\nNovo Salário: " + salario);
        	break;
        	
        default:
    		System.out.println("Opção inválida");
    		break;
        }
      
        	
		
		
		
	}

}
