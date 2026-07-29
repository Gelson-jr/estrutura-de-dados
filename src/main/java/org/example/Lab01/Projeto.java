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

        if (quantidadefuncionarios < funcionarios.length){
            funcionarios[quantidadefuncionarios] = funcionario;
            quantidadefuncionarios++;

            System.out.println(
                    funcionario.getNome() + "Foi adicionado ao grupo"
            );

            System.out.println("A equipe está cheia");
        }

        }

    public void finalizarProjeto() {
        finalizado = true;
    }

    public double calcularCustoTotal() {

        return 0;
    }

}

