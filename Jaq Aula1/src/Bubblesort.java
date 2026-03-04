import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {

        int[] vet1 = {25,57,48,37,12,92,86,33};
        bubbleSort(vet1);
        System.out.println(Arrays.toString(vet1));

        int[] vet2 = {25,57,48,37,12,92,86,33};
        selectionSort(vet2);
        System.out.println(Arrays.toString(vet2));
        }
    }

    public static void bubbleSort(int[] vetor) {

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] vetor) {

        for (int i = 0; i < vetor.length - 1; i++) {

            int posmenor = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posmenor]) {
                    posmenor = j;
                }
            }

            int temp = vetor[i];
            vetor[i] = vetor[posmenor];
            vetor[posmenor] = temp;
        }
    }
}