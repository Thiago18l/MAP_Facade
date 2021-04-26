package Entities;

import java.util.Arrays;

public class Aluno {
    private String[] disciplinas;
    private String[] historico;
    private String nome;
    private int matricula;


    public Aluno () {}

    public Aluno (String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String[] getHistorico() {
        return historico;
    }

    public void setHistorico(String[] historico) {
        this.historico = historico;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void addDisciplinas (String[] disciplinas) throws Exception {
        if (disciplinas[0] == null) {
            throw new Exception("Disiciplinas não pode ser null");
        }
        this.disciplinas = disciplinas;
    }
    public void addHistoricoEscolar (String[] historico) throws Exception {
        if (historico[0] == null) {
            throw new Exception("Historico não pode ser null");
        }
        this.historico = historico;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno" +
                " disciplinas=" + Arrays.toString(disciplinas) +
                ", historico=" + Arrays.toString(historico) +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula;
    }
}
