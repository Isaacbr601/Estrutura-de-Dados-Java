package Bimestre2;

public class LinkedList <T> {
    private static class Node<T>{
        public T data;
        public Node<T> next;

        public Node(T val) {
            this.data = val;
            this.next = null;
        }
    }
    private Node<T> head;
    private int count;

    public LinkedList(){
        this.head = null;
        this.count = 0;
    }

    public boolean isEmpty(){
        return this.count == 0;
    }
    public int getCount(){
        return this.count;
    }

    //Método que retorna a quantidade de elementos da lista
    public void append(T val) {
        Node<T> inserted = new Node<>(val);
        Node<T> current;

        if (isEmpty()){
            this.head = inserted;
        } else {
            current = this.head;
            while (current.next != null){
                current = current.next;
            }
            current.next = inserted;
        }
        this.count++;
    }
    public String print(){
        Node<T> current = this.head;
        String output = "";
        while (current != null){
            output += current.data + " ";
            current = current.next;
        }
        return output;
    }
    //programa Principal
    public static void main(String[] args){
        LinkedList<String> lista = new LinkedList<>();

        lista.append("3");
        System.out.println(lista.print());
    }
}
