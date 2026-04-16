package Bimestre1;

import java.util.Arrays;

public class Trabalho {
    public  static void main(String[] args) {
        int [] tamanhos = {100,1000,10000,100000};

        for (int tamanho : tamanhos) {
            System.out.println("\n===== TAMANHO: " + tamanho + " =====");


            int[] aleatorio = gerarAleatorio(tamanho);
            int[] ordenado = gerarOrdenados(tamanho);
            int[] invertido = gerarInvertido(tamanho);

            testar("bubbleSort - Aleatorio", aleatorio, "Bubble");
            testar("bubbleSort - Ordenado", ordenado, "Bubble");
            testar("bubbleSort - Invertido", invertido, "Bubble");

            testar("SelectionSort - Aleatorio", aleatorio, "Selection");
            testar("SelectionSort - Ordenado", ordenado, "Selection");
            testar("SelectionSort - Invertido", invertido, "Selection");

            testar("InsertionSort - Aleatorio", aleatorio, "Insertion");
            testar("InsertionSort - Ordenado", ordenado, "Insertion");
            testar("InsertionSort - Invertido", invertido, "Insertion");

            testar("QuickSort - Aleatorio", aleatorio, "Quick");
            testar("QuickSort - Ordenado", ordenado, "Quick");
            testar("QuickSort - Invertido", invertido, "Quick");
        }
    }
    public static void testar(String nome, int[] vetorOriginal, String tipo){

    int[] vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
    long inicio = System.currentTimeMillis();

    if (tipo.equals("Bubble")){
        bubbleSort(vetor);
    } else if (tipo.equals("Selection")) {
        selectionSort(vetor);
    } else if(tipo.equals("Insertion")) {
        insertionSort(vetor);
        } else if(tipo.equals("Quick")) {
        quick(vetor, 0, vetor.length - 1);
    }
    long fim = System.currentTimeMillis();
        System.out.println(nome + ": " + (fim - inicio) + "ms");
    }

public static int[] gerarOrdenados(int tamanho){
    int [] vetor = new int[tamanho];
    
    for (int i = 0; i< vetor.length; i++){
        vetor[i] =i;
        }
    return vetor;
    }
    public static int [] gerarInvertido(int tamanho){
        int [] vetor = new int[tamanho];
        for (int i=0; i < vetor.length; i++ ){
            vetor[i] = tamanho -1 -i;
        }
        return vetor;
    }
    public static int [] gerarAleatorio(int tamanho){
        int [] vetor = new int[tamanho];
        for (int i=0; i < vetor.length; i++){
            vetor[i] = (int) (Math. random()  * 1000) ;
        }
        return vetor;
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
    public static void insertionSort(int [] vetor) {
        for (int i=1; i < vetor.length; i++) {
            int aux = vetor[i];
            int j ;
            for (j = i -1; j>=0 && vetor[j]> aux; j--){
                vetor[j+1] = vetor[j];
            }
            vetor[j+1] = aux;
        }
    }
    public static void quick(int[] array, int left, int right){
        int i = left;
        int j = right;
        int aux;
        int pivotidx = (left + right)/2;
        int pivot = array[pivotidx];

        while (i <= j){
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;
            if (i <= j){
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        }

        if (left < j)
            quick(array, left, j);
        if (i < right)
            quick(array, i, right);
    }
}

