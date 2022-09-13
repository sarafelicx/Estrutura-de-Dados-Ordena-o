package controller;

public class QuickController {

	public QuickController() {

		super();
	}

	public int[] quickSort(int[] vetor, int inicio, int fim) {

		if (fim > inicio) {

			int posicaoFixa = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoFixa - 1);
			quickSort(vetor, posicaoFixa + 1, fim);
		}

		return vetor;
	}

	public int dividir(int[] vetor, int inicio, int fim) {

		int pivo = vetor[inicio];
		int ponteiroEsquerda = inicio + 1;
		int ponteiroDireita = fim;

		while (ponteiroEsquerda <= ponteiroDireita) {

			while (ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo) {

				ponteiroEsquerda++;
			}

			while (ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroDireita] >= pivo) {

				ponteiroDireita--;
			}

			if (ponteiroEsquerda < ponteiroDireita) {

				trocar(vetor, ponteiroEsquerda, ponteiroDireita);

				ponteiroEsquerda++;
				ponteiroDireita--;
			}
		}

		trocar(vetor, inicio, ponteiroDireita);
		return ponteiroDireita;

	}

	public void trocar(int[] vetor, int i, int j) {

		int auxiliar = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = auxiliar;

	}

}
