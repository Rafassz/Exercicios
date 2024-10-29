		package exerciciosifswitch;

import java.util.Scanner;

public class ExIf1 {

	public static void main(String[] args) {

		int na,nb,nc;
		Scanner leia = new Scanner (System.in);

		System.out.println("Digite O número A:");
		na = leia.nextInt();

		System.out.println("Digite O número B:");
		nb = leia.nextInt();

		System.out.println("Digite O número C:");
		nc = leia.nextInt();

		if(nc > (na + nb )) {
			System.out.println("O número C é maior que a soma de A + B");


		}else if(nc < (na + nc)) {
			System.out.println("O número C é menor que a soma de A + B");
		}

		else {
			System.out.println("O número C tem o mesmo valor da soma de A + B");


		}
	}

}
