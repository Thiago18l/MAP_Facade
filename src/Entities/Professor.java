package Entities;

import java.util.Arrays;

public class Professor {
    private String nome;
    private int matricula;
    private String[] disciplinas;
    private int tempoDeCasa;
    public Professor () {}

    public Professor (String nome, int matricula, String[] disciplinas, int tempoDeCasa) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = disciplinas;
        this.tempoDeCasa = tempoDeCasa;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setDisciplinas(String[] disciplinas) throws Exception {
        if (disciplinas[0] == null) {
            throw new Exception("Disciplinas não pode ser nulo");
        }
        this.disciplinas = disciplinas;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    @Override
    public String toString() {
        return "Professor:" +
                " nome = " + nome + '\'' +
                ", matricula = " + matricula +
                ", disciplinas = " + Arrays.toString(disciplinas) +
                ", tempoDeCasa = " + tempoDeCasa + " ano";
    }
}
