import java.util.ArrayList;
import java.util.Scanner;

public class ex4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros deseja inserir? ");
        int n = sc.nextInt();

        int[] vetor= new int[n];

        for (int i = 0; i< n; i++){
            System.out.println("Digite o numero "+ (i+1) + ":");
            vetor[i] = sc.nextInt();
        }
        System.out.println("\nQuantidade de numeros negativos: "+ contarNegativos(vetor));
        System.out.println("Média dos numeros pares: "+ mediaPares(vetor));
        System.out.println("Soma dos multiplos de 3 e 5: " + somaMult(vetor));
        System.out.println("Numeros impares: ");
        listarImpares(vetor);
        System.out.println("Menor elemento: "+ menorElemento(vetor));
        System.out.println("Posição do maior elemento: "+ posicaoMaior(vetor));
        if (temRepetidos(vetor)){
            System.out.println("O vetor já possui numeros repetidos.");
        }else {
            System.out.println("O vetor não possui numeros repetidos.");
        }
        System.out.println("Vetor sem repetidos: ");
        removerRepetidos(vetor);
    }
    static int contarNegativos(int[] v){
        int count = 0;
        for (int num : v){
            if (num<0){
                count++;
            }
        }
        return count;
    }
    static double mediaPares(int[] v){
        int soma = 0;
        int qtd = 0;

        for (int num : v){
            if (num %2 ==0) {
                soma += num;
                qtd++;
            }
        }
        if (qtd == 0){
            return 0;
        }
        return (double) soma / qtd;
    }
    static int somaMult(int[] v){
        int soma = 0;
        for (int num: v){
            if (num % 3 == 0 && num % 5 ==0){
                soma += num;
            }
        }
        return soma;
    }
    static void listarImpares(int[] v){
        for (int num: v){
            if (num % 2 !=0){
                System.out.println(num + " ");
            }
        }
        System.out.println();
    }
    static int menorElemento(int[] v){
        int menor = v[0];
        for (int num: v){
            if (num < menor){
                menor = num ;
            }
        }
            return menor;
    }
    static int posicaoMaior(int[] v){
        int maior = v[0];
        int posicao = 0;

        for (int i = 1; i < v.length; i++){
            if (v[i]> maior){
                maior = v[i];
                posicao =1;
            }
        }
        return posicao;
    }
    static boolean temRepetidos(int[] v){
        for (int i = 0; i < v.length; i++){
            for (int j = i + 1; j< v.length; j++){
                if (v[i]== v[j]){
                    return true;
                }
            }
        }
        return false;
    }
    static void removerRepetidos(int[] v){
        ArrayList<Integer> novoVetor = new ArrayList<>();
        for (int num: v){
            if (!novoVetor.contains(num)){
                novoVetor.add(num);
            }
        }
        for (int num : novoVetor){
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
