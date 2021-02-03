package ListaEncadeada;

import java.util.LinkedList;

public class Exercicio1 {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<Integer>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(10);
        int soma = 0;
        for (int i =0;i < lista.size();i++){
            soma+=lista.get(i);
        }
        System.out.println(soma);

    }
}
