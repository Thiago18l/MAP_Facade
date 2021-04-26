package test;

import Entities.Salas;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Salas_test {
    private Salas salas;
    @Before
    public void instanciaClasse () {
        salas = new Salas("C100", 30);
    }

    @Test
    public void testStatusIfSalaIsFree () {
        boolean expected = false;
        Assert.assertEquals(expected, salas.isStatus());
    }
    @Test
    public void testStatusIfSalaIsBusy () {
        salas.ocuparSala();
        Assert.assertTrue(salas.isStatus());
    }
    @Test(expected = Exception.class)
    public void testShouldThrowExceptionIfNameIsNull () throws Exception {
        salas.setNome_sala(null);
    }
}
