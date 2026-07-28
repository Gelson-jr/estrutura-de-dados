package org.example.Lab01;

public class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome(){
        return nome;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public double calcularSalarioFinal(boolean projetoFinalizado){

        if (projetoFinalizado){
            return salarioBase + (salarioBase * 0.10);

            }

        return salarioBase;

    }
}
