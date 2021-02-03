package ListaEncadeada;

import java.util.LinkedList;

public class Exercicio2 {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<Integer>();

        lista.add(3);
        lista.add(10);
        lista.add(5);
        lista.add(12);
        int maior=0;

        for (int i = 0 ; i<lista.size();i++){
            if (lista.get(i)>maior){
                maior = lista.get(i);
            }
        }
        System.out.println(maior);

    }
}
