package org.example;

import org.example.vetor.VetorEstatico;


public class Main {
    static void main() {

        VetorEstatico vetor = new VetorEstatico(10);

        vetor.inserir("A");
        vetor.inserir("B");
        vetor.inserir("C");
        vetor.inserir("D");
        vetor.inserir("E");
        vetor.inserir("F");

        vetor.inserir(2,"J");

        vetor.imprimir();
        vetor.obterTamanho();

        System.out.println("//-----------------------------------------//");

        vetor.removerFinal();
        vetor.imprimir();
        vetor.obterTamanho();

        //Removendo
        System.out.println("Removendo na posição 2");
        vetor.remover(2);

        System.out.println("arranjo após a posição");
        VetorEstatico.imprimir();

    }
}