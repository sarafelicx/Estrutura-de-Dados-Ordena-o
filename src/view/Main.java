package view;

import controller.QuickController;

public class Main {

	public static void main(String[] args) {

		QuickController quick = new QuickController();

		int[] vetor = { 89, 54, 18, 71, 93, 45, 19, 14, 99, 2, 27, 3, 58, 91, 75 };

		quick.quick(vetor);

	}
}
