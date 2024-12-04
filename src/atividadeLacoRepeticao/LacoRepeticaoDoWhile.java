package atividadeLacoRepeticao;

import java.util.Scanner;

public class LacoRepeticaoDoWhile {

	public static void main(String[] args) {

		int total = 0, numero = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um número inteiro: " );
			numero = leia.nextInt();
			
			if (numero >= 1) {
			total += numero++;
			}
			
		} while( numero != 0 );

		

		System.out.println("\nA soma total dos números são: " + total  );
		

		leia.close();
	}
}
