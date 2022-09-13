package controller;

import br.edu.fateczl.QuickSort.QuickSortController;

public class QuickController {

	public QuickController() {
		super();
	}
	
	public void quick(int [] vetor) {
		
		QuickSortController quick = new QuickSortController();
		
			
		int [] vetorOrdenado = quick.quickSort(vetor, 0, vetor.length-1); 
		
		for(int valor : vetorOrdenado) {
			
			System.out.print(valor);
			System.out.print(" ");
		}
	}

}
