package Lacorepetição;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade = 0, contePessoasMenor = 0, contePessoasMaior = 0;

		while (idade >= 0) {
			System.out.println("\nDigite a idade: ");
			idade = leia.nextInt();
			if (idade >= 1 && idade < 21) {
				contePessoasMenor++;
			} else if (idade > 50) {
				contePessoasMaior++;
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos: " + contePessoasMenor);
		System.out.println("Total de pessoas com menos de 21 anos: " + contePessoasMaior);

	}

}
