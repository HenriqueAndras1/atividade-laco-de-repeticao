package atividadeLacoRepeticao;

import java.util.Scanner;

public class LacoRepeticaoFor {

	public static void main(String[] args) {
		
		int contador, numero, par = 0, impar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(contador = 1; contador <= 10; contador++) {
		System.out.println("Digite um " + contador + "º número:");
		numero = leia.nextInt();
		
		if(numero % 2 == 0){
			par++;
		}else {
			impar++;
		}
		
		}
			System.out.println("\nO Total de numeros pares são : " + par  );
			System.out.println("\nO Total de numeros impares são : " + impar  );
		
		
	}

}
