package test;

import Domain.Administracao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Administracao_test {
    private Administracao administracao;
    @Rule
    public ExpectedException excecaoEsperada = ExpectedException.none();
    @Before
    public void instanciaClasse () {
        administracao = new Administracao();
    }
    @Test
    public void testAgendamentoEntrevistas () throws Exception {
        administracao.agendarEntrevista("25/04/2021");
        String[] expected = {"25/04/2021"};
        Assert.assertArrayEquals(expected, administracao.entrevistas());

    }
    @Test
    public void testAgendamentoReunioes () throws Exception {
        administracao.agendarReuniaoDiretoria("25/04/2022");
        administracao.agendarReuniaoDiretoria("26/05/2021");
        String[] expected = {"25/04/2022", "26/05/2021"};
        Assert.assertArrayEquals(expected, administracao.reunioesDiretoria());
    }

    @Test(expected = Exception.class)
    public void testSeForNulo () throws Exception {
        administracao.agendarEntrevista(null);
    }
    @Test(expected = Exception.class)
    public void testNullAgendarReuniao () throws Exception {
        administracao.agendarReuniaoDiretoria(null);
    }
}
