package test;

import Domain.*;
import Entities.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Infra_test {
    private Infra infra;
    private ArrayList<Salas> salas;
    @Before
    public void instanciaClasse () throws Exception {
        infra = new Infra();
        Salas sala = new Salas("C101", 37);
        sala.ocuparSala();
        salas = new ArrayList<>();
        salas.add(new Salas("C102", 35));
        salas.add(sala);
        infra.addSalas(salas);
    }
    @Test
    public void testAddSalas () throws Exception {
        Salas sala = new Salas("C103", 40);
        salas.add(sala);
        infra.addSalas(salas);
        Salas expected = sala;
        Assert.assertEquals(expected, infra.getSalas("C103"));
    }
    @Test
    public void testAlocaSala () throws Exception {
        infra.alocacaoDeSalas("C102");
    }

    /**
     * Deve lançar uma exceção se a sala já
     * estiver ocupada
     * @throws Exception
     */
    @Test(expected = Exception.class)
    public void testShouldThrowException () throws Exception {
        infra.alocacaoDeSalas("C101");
    }
    @Test(expected = Exception.class)
    public void testShouldThrowExceptionIfClassIsAlreadyFree () throws Exception {
        infra.desocuparSala("C102");
    }
}
