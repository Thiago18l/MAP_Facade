package test;

import Entities.Contas;
import org.junit.Before;
import org.junit.Test;

public class Contas_test {
    private Contas contas;
    @Before
    public void instanciaClasse () {
        contas = new Contas();
    }
    @Test(expected = Exception.class)
    public void testIsNotNull () throws Exception {
        contas.setNome(null);
    }

}
