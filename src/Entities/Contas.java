package Entities;

public class Contas {
    private String nome;
    private double valor_conta;

    public Contas (String nome, double valor) {
        this.nome = nome;
        this.valor_conta = valor;
    }

    public Contas() {

    }

    public void setNome(String nome) throws Exception {
        if (nome == null) {
            throw new Exception("Nome não pode ser null");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getValor_conta() {
        return valor_conta;
    }

    @Override
    public String toString() {
        return "Contas " +
                "nome='" + nome + '\'' +
                ", valor =" + valor_conta;
    }
}
