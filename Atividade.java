package Lacorepetição;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n1, n2, x = 0;

		System.out.println("Digite o primeiro numero");
		n1 = leia.nextInt();

		System.out.println("Digite o segundo numero");
		n2 = leia.nextInt();

		if (n1 >= n2) {
			System.out.println("intervalo invalido");
		}

		for (x = n1; x <= n2; x++) {
			if (x % 3 == 0 && x % 5 == 0) {
				System.out.println(x + " é multiplo de 3 e 5");
			}

		}

	}
}