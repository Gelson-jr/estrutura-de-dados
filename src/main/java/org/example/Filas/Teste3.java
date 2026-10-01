package Atividades.Fila;

public class Teste3 {

    static void main(){

        Atividades.Fila.FilaCircular<String> fila = new Atividades.Fila.FilaCircular<>(4);

        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.enfileirar("D");

        fila.imprimir();

        IO.println("Removido " + fila.desenfileirar());
        IO.println("Removido " + fila.desenfileirar());
        fila.imprimir();

        fila.enfileirar("F");
        fila.enfileirar("G");
        fila.imprimir();

    }
}