package Bimestre1;

import java.util.Arrays;

public class QuirkSort {
    public static void quick(int[] array, int left, int right){
        int i = left;
        int j = right;
        int aux;
        int pivotidx = (left + right)/2;
        int pivot = array[pivotidx];
        //Partição
        while (i <=j){
            while (array[i]< pivot)
                i++;
            while (array[j] > pivot)
                j--;
            if (i<=j){
                aux= array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        }
        //Recursão
        if (left < j)
            quick(array, left, j);
        if (i < right)
            quick(array, i, right);
    }

    public static void main(String[] args) {
        int [] vet = {77,44,22,33,99,55,88,0,66,11};
        quick(vet, 0, vet.length -1);
        System.out.println(Arrays.toString(vet));
    }
}
