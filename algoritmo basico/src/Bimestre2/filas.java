package Bimestre2;

public class filas {
    public static void main(String[] args) {
        int[] filaA = {1,3,5};
        int []filaB = {2,4,6};

        int[] resultado =  intercalarFilas(filaA, filaB);

        for (int i= 0; i <resultado.length; i++) {
            System.out.println(resultado[i] + "");
        }
    }
    public static int[] intercalarFilas(int []a, int[] b){
        int tamanho = a.length + b.length;
        int[] resultado = new int[tamanho];

        int i = 0, j = 0, k = 0;

        while(i < a.length && j < b.length){
            resultado[k++] = a[i++];
            resultado[k++] = b[j++];
        }
        while (i < a.length){
            resultado[k++] = a[i++];
        }
        while (j < b.length){
            resultado[k++] = b[j++];
        }
        return resultado;
    }
}
