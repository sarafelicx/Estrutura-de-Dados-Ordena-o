package view;

import controller.QuickController;

public class Main {

	public static void main(String[] args) {

		int[] vetor = { 69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1 };
		int inicio = 0;
		int fim = vetor.length - 1;

		QuickController quick = new QuickController();

		vetor = quick.quickSort(vetor, inicio, fim);

		for (int valor : vetor) {

			System.out.print(valor);
			System.out.print(" ");

		}

	}
}
