/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
 * o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o 
 * número e o salário do funcionário, com duas casas decimais.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroFuncionario, horasTrabalhadas;
		double valorHoraTrabalhada, salario;

		numeroFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHoraTrabalhada = sc.nextDouble();

		salario = horasTrabalhadas * valorHoraTrabalhada;

		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();

	}

}
