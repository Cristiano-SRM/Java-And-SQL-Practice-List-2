package PraticasJava.Ordenacao2;
import java.util.Arrays;
public class Ordenacao {

    // Método de ordenação por bolha
    public static void bolha(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca de elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    // Método de ordenação por seleção
    public static void selecao(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            // Troca de elementos
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
    }

    // Método de ordenação por inserção
    public static void insercao(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int key = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = key;
        }
    }

    // Método de ordenação Quicksort
    public static void quicksort(int[] vetor, int low, int high) {
        if (low < high) {
            int pi = partition(vetor, low, high);
            quicksort(vetor, low, pi - 1);
            quicksort(vetor, pi + 1, high);
        }
    }

    private static int partition(int[] vetor, int low, int high) {
        int pivot = vetor[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (vetor[j] < pivot) {
                i++;
                // Troca de elementos
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        // Troca de elementos
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[high];
        vetor[high] = temp;
        return i + 1;
    }

    // Método de ordenação Merge Sort
    public static void mergeSort(int[] vetor, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(vetor, low, mid);
            mergeSort(vetor, mid + 1, high);
            merge(vetor, low, mid, high);
        }
    }

    private static void merge(int[] vetor, int low, int mid, int high) {
        int[] left = Arrays.copyOfRange(vetor, low, mid + 1);
        int[] right = Arrays.copyOfRange(vetor, mid + 1, high + 1);
        int i = 0, j = 0, k = low;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                vetor[k] = left[i];
                i++;
            } else {
                vetor[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            vetor[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            vetor[k] = right[j];
            j++;
            k++;
        }
    }

    // Método para imprimir o vetor
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
