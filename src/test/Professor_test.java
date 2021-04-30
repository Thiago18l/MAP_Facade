package test;

import Entities.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Professor_test {
    private Professor professor;
    private String[] disciplinas;
    @Before
    public void instanciaClasse () {
        professor = new Professor();
        disciplinas = new String[2];
    }
    @Test
    public void testAddDisciplinas () throws Exception {
        disciplinas[0] = "Matemática";
        disciplinas[1] = "Calculo 1";
        professor.setDisciplinas(disciplinas);
        String[] expected = {"Matemática", "Calculo 1"};
        Assert.assertArrayEquals(expected, professor.getDisciplinas());
    }
    @Test(expected = Exception.class)
    public void testShouldThrowException () throws Exception {
        professor.setDisciplinas(null);
    }
}
