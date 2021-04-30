package Entities;

public class Salas {
    private String nome_sala;
    private int capacidade_sala;
    private boolean status;

    public Salas () {}

    public Salas (String nome, int capacidade) {
        this.nome_sala = nome;
        this.capacidade_sala = capacidade;
    }

    public void setNome_sala(String nome_sala) throws Exception {
        if (nome_sala == null) {
            throw new Exception("Nome não pode ser nulo");
        }
        this.nome_sala = nome_sala;
    }

    public int getCapacidade_sala() {
        return capacidade_sala;
    }

    public void setCapacidade_sala(int capacidade_sala) {
        this.capacidade_sala = capacidade_sala;
    }

    public boolean isStatus() {
        return status;
    }

    public String getNome_sala() {
        return nome_sala;
    }

    public void ocuparSala () {
        this.status = true;
    }
    public void desocuparSala () {
        this.status = false;
    }
    @Override
    public String toString() {
        return "Salas {" +
                "nome_sala='" + nome_sala + '\'' +
                ", capacidade_sala=" + capacidade_sala +
                ", status=" + status +
                '}';
    }


}
