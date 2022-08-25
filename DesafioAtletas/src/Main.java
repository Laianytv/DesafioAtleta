
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome = null, nomeMaisAlto = null;
		int n, cont;
		char sexo = 0;
		double altura, peso, mediaPeso, maiorAltura, quantHomens, porHomens, somaMulheres, mediaM, somaPeso;

		peso = 0;
		altura = 0;
		mediaPeso = 0;
		maiorAltura = 0;
		quantHomens = 0;
		porHomens = 0;
		somaMulheres = 0;
		cont = 0;
		mediaM = 0;
		somaPeso = 0;

		System.out.print("Qual a quantidade de atletas?");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.printf("Digite os dados do atleta numero %d : ", i + 1);
			System.out.println();
			System.out.print("Nome:");
			nome = sc.next();
			System.out.print("Sexo:");
			sc.nextLine();
			sexo = sc.next().charAt(0);

			while (sexo != 'f' && sexo != 'm') {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sexo = sc.next().charAt(0);
			}

			System.out.print("Altura:");
			altura = sc.nextDouble();

			while (altura <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo:");
				altura = sc.nextDouble();
			}

			System.out.print("Peso:");
			peso = sc.nextDouble();

			while (peso <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo:");
				peso = sc.nextDouble();

			}

			somaPeso = somaPeso + peso;

			if (altura > maiorAltura) {
				nomeMaisAlto = nome;
				maiorAltura = altura;
			}

			if (sexo == 'm') {
				quantHomens = quantHomens + 1;
				porHomens = quantHomens / n * 100;
			}

			if (sexo == 'f') {
				somaMulheres = somaMulheres + altura;
				cont = cont + 1;
				mediaM = somaMulheres / cont;
				System.out.printf("Altura média das mulheres:  %.2f%n", mediaM);
			}

		}

		mediaPeso = somaPeso / n;

		System.out.println("RELATÓRIO:");
		System.out.printf("Peso médio dos atletas: %.2f%n ", mediaPeso);
		System.out.printf("Atleta mais alto: %s%n ", nomeMaisAlto);
		System.out.printf("Porcentagem de homens: %.1f %%%n ", porHomens);
		if (cont == 0) {
			System.out.println("Não há mulheres cadastradas");
		} else {
			System.out.printf("Altura média das mulheres: %.2f%n", mediaM);
		}

		sc.close();

	}

}

