package org.example.Lab01;

public class Projeto {

    private String nome;
    private Gerente gerente;
    private Funcionario[] funcionarios;
    private boolean finalizado;
    private int quantidadefuncionarios;

    public Projeto(String nome, Gerente gerente, int tamanhoEquipe){
        this.nome = nome;
        this.gerente = gerente;
        this.funcionarios = new Funcionario[tamanhoEquipe];
        this.finalizado = false;
        this.quantidadefuncionarios = 0;
    }

    public void adicionarFuncionario(Funcionario funcionario){

    }

}

