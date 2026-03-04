public class SelectionSort {
    public static void main(String[] args) {

        int[] vetor = {25,57,48,37,12,92,86,33};
        for (int i = 0; i < vetor.length - 1; i++) {

            int menor = i;
            for (int j = i + 1; j < vetor.length; j++) {

                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = temp;
        }
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}