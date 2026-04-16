package Bimestre2;

public class Pilha {
    public static void main(String[] args) {

        String texto = "EXERCICIO MUITO COMPLICADO";
        System.out.println(inverterPalavras(texto));
    }
    public static String inverterPalavras(String texto) {

        String[] palavras = texto.split(" ");
        String resultado = "";

        for (String palavra: palavras) {
            String invertida = "";

            for (int i = palavra.length()-1; i>=0;i--) {
                invertida += palavra.charAt(i);
            }
            resultado += invertida + " ";
        }
        return resultado.trim();
    }
}
