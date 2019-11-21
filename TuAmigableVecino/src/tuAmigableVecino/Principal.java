package tuAmigableVecino;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int a, pos, b, casos;

		casos = leer.nextInt();
		for (int i = 0; i < casos; i++) {
			pos = leer.nextInt();

			a = leer.nextInt();

			b = leer.nextInt();

			if ((Math.abs(pos - a) + Math.abs(a - b)) < (Math.abs(pos - b) + Math.abs(b - a))) {
				System.out.println((Math.abs(pos - a) + Math.abs(a - b)));
			} else {
				System.out.println((Math.abs(pos - b) + Math.abs(b - a)));
			}
		}
	}
}
