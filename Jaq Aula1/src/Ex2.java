public class Ex2 {
    static void main(String[] args) {
        int [] nums = {0,11,22,33,44,55,66,77,88,99};
        int x = 88;

        int pos =buscaBinaria(nums, x, 0, nums.length -1);
        if (pos != -1){
            System.out.println("Número " + x + "encontrado na posição " + pos);
        }
        else {
            System.out.println("Número " + x + "Não encontrado.");
        }
    }
    public static int[] Ordenado(int tamanho){
        int [] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i+1;
        }
        return vetor;
    }
    public static int buscaBinaria(int[] vetor, int x, int inicio, int fim ){
        if (inicio > fim){
            return -1;
        }
        int meio = (inicio + fim) /2;
        if (vetor[meio] == x){
            return meio;
        }
        else if (x < vetor[meio]){
            return buscaBinaria(vetor, x ,inicio, meio -1);
        }
        else {
            return buscaBinaria(vetor, x , meio + 1, fim);
        }
    }

}
