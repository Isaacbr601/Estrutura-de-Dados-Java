package Bimestre2;
//Isaac de Sousa Resende
public class Trabalho {

    public static boolean verificar(String expressao) {
        java.util.Stack<Character> pilha = new java.util.Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char atual = expressao.charAt(i);

            if (atual == '(' || atual == '[' || atual == '{') {
                pilha.push(atual);
            }
            else if (atual == ')' || atual == ']' || atual == '}') {
                if (pilha.isEmpty()) {
                    return false;
                }

                char topo = pilha.pop();

                if (atual == ')' && topo != '(') return false;
                if (atual == ']' && topo != '[') return false;
                if (atual == '}' && topo != '{') return false;
            }
        }

        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        String teste1 = "((1 + 2) * [3 / {4 - 5}])";
        String teste2 = "((1 + 2) * [3 / {4 - 5})]";

        System.out.println("Expressão 1: " + (verificar(teste1) ? "Correta" : "Incorreta"));
        System.out.println("Expressão 2: " + (verificar(teste2) ? "Correta" : "Incorreta"));
    }
}
