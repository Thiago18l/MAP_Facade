package test;

import Entities.Aluno;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Aluno_test {
    private Aluno aluno;
    private String[] disciplinas;
    private String[] historico;

    @Before
    public void instanciaClasse () {
        aluno = new Aluno();
        disciplinas = new String[2];
        historico = new String[2];
    }
    @Test
    public void testAddDisciplina () throws Exception {
        disciplinas[0] = "Matemática";
        disciplinas[1] = "Português";
        aluno.addDisciplinas(disciplinas);
        String[] expected = {"Matemática", "Português"};
        Assert.assertArrayEquals(expected, aluno.getDisciplinas());
    }
    @Test
    public void testAddHistorico () throws Exception {
        historico[0] = "Matemática, 10";
        historico[1] = "Português, 10";
        aluno.addHistoricoEscolar(historico);
        String[] expected = {"Matemática, 10", "Português, 10"};
        Assert.assertArrayEquals(expected, aluno.getHistorico());
    }
    @Test(expected = Exception.class)
    public void testSeForNulo () throws Exception {
        aluno.addDisciplinas(null);
    }
}
