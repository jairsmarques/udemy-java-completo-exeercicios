/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o 
 * mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 
 * 24 horas.
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int dia = 24;

		int duracao = 0;
		if (horaInicial > horaFinal) {
			duracao = (dia - horaInicial) + horaFinal;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		} else if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		} else {
			duracao = dia;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}

		sc.close();

	}

}
