import java.util.Arrays;

public class ex1 {
    public  static void main(String[] args) {
        int [] aleatorio = gerarAleatorio(1000);
        int [] ordenado = gerarOrdenados(1000);
        int [] invertido = gerarInvertido(1000);

        testar("bubbleSort - Aleatorio", aleatorio, "Bubble");
        testar("bubbleSort - Ordenado", ordenado, "Bubble");
        testar("bubbleSort - Invertido", invertido, "Bubble");

        testar("SelectionSort - Aleatorio", aleatorio, "Selection");
        testar("SelectionSort - Ordenado", ordenado, "Selection");
        testar("SelectionSort - Invertido", invertido, "Selection");

        testar("InsertionSort - Aleatorio", aleatorio, "Insertion");
        testar("InsertionSort - Ordenado", ordenado, "Insertion");
        testar("InsertionSort - Invertido", invertido, "Insertion");
    }
    public static void testar(String nome, int[] vetorOriginal, String tipo){

    int[] vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
    long inicio = System.currentTimeMillis();

    if (tipo.equals("Bulle")){
        bubbleSort(vetor);
    } else if (tipo.equals("Selection")) {
        selectionSort(vetor);
    } else if(tipo.equals("Insertion")) {
        insertionSort(vetor);
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
}

