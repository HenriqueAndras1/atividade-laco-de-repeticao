package atividadeLacoRepeticao;

import java.util.Scanner;

public class LacoRepeticaoWhile {

	public static void main(String[] args) {

		int maior = 0, menor = 0, idade = 0, negativo = 0;

		Scanner leia = new Scanner(System.in);

		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();

			if (idade <= 21 && idade > 0) {
				menor++;
			} else if (idade >= 50) {
				maior++;
			} else if (idade < 0) {
				negativo++;
			}

		}

		System.out.println("\nO Total de pessoas menores de 21 anos: " + menor);
		System.out.println("O Total de pessoas maiores de 50 anos: " + maior);

		leia.close();
	}
}
