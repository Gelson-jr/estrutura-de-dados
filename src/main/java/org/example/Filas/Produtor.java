package Atividades.Fila;

public class Produtor {

    private String nome;
    private String endereco;

    public Produtor(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void produzirPacote(Atividades.Fila.Fila<Atividades.Fila.Pacote> fila, int numero, String origem, String destino, String dados){
        Atividades.Fila.Pacote pacote = new Atividades.Fila.Pacote(numero, origem, destino, dados);
        fila.enfileirar(pacote);
        IO.println(nome + "produziu "+ pacote );
    }
}
