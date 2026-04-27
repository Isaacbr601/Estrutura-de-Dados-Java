package Bimestre2;

class No {
    int valor;
    No prox;

    public No(int valor) {
        this.valor = valor;
        this.prox = null;
    }
}

public class ListaEncadeada {
    private No inicio;

    public void inserirInicio(int valor) {
        No novo = new No(valor);
        novo.prox = inicio;
        inicio = novo;
    }

    public void mostrarLista() {
        No atual = inicio;

        if (atual == null) {
            System.out.println("Lista vazia.");
            return;
        }

        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.prox;
        }
        System.out.println();
    }

    public void removerPrimeiro() {
        if (inicio != null) {
            inicio = inicio.prox;
        }
    }

    public int buscarPosicao(int valor) {
        No atual = inicio;
        int posicao = 0;

        while (atual != null) {
            if (atual.valor == valor) {
                return posicao;
            }
            atual = atual.prox;
            posicao++;
        }

        return -1;
    }

    public void removerPosicao(int posicao) {
        if (inicio == null || posicao < 0) {
            return;
        }

        if (posicao == 0) {
            inicio = inicio.prox;
            return;
        }

        No atual = inicio;
        int indice = 0;

        while (atual != null && indice < posicao - 1) {
            atual = atual.prox;
            indice++;
        }

        if (atual != null && atual.prox != null) {
            atual.prox = atual.prox.prox;
        }
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();


        lista.inserirInicio(30);
        lista.inserirInicio(20);
        lista.inserirInicio(10);

        System.out.print("Lista: ");
        lista.mostrarLista();

        System.out.println("Posição do 20: " + lista.buscarPosicao(20));

        lista.removerPrimeiro();
        System.out.print("Após remover primeiro: ");
        lista.mostrarLista();

        lista.removerPosicao(1);
        System.out.print("Após remover posição 1: ");
        lista.mostrarLista();
    }
}