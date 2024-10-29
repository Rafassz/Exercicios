package exerciciosvariaveisoperadores;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		int salario, noturno, extras, desconto,resul ;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite seu Salário Bruto: ");
		salario = ler.nextInt();
		
		System.out.println("Digite seu Adicional Noturno: ");
		noturno = ler.nextInt();
		
		System.out.println("Digite suas Horas Extras: ");
		extras = ler.nextInt();
		
		System.out.println("Digite seus Descontos: ");
		desconto = ler.nextInt();
		
		resul = salario + noturno + (extras *5) - desconto;
		
		System.out.println("Seu salário líquido é de : " + resul );
		
	}

}
