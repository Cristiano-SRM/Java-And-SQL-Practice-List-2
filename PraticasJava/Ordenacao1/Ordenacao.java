package PraticasJava.Ordenacao1;

public class Ordenacao {
    public void bolha(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
/* percorre o vetor substuindo os valores comparando-os de maior e menor ate organizar o vetor */
                }
            }
        }
    }

    public void selecao(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
/*Divide o vetor em duas partes: a parte ordenada e a parte não ordenada.
A cada iteração, encontra o menor elemento da parte não ordenada e o coloca no início da parte não ordenada,
 expandindo assim a parte ordenada. */
                }
            }
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
    }

    public void insercao(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
/*Constrói gradualmente a parte ordenada do vetor.
A cada iteração, pega o próximo elemento da parte não ordenada
 e o insere na posição correta dentro da parte já ordenada. */
        }
    }
}
