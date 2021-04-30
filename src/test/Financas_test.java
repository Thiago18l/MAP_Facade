package test;

import Domain.*;
import Entities.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Financas_test {
    private Financas financas;
    private Contas conta;
    @Before
    public void instanciaClasse () {
        financas = new Financas(500.00);
        conta = new Contas("Luz", 150.00);

    }
    @Test
    public void testFolhaPagamento () throws Exception {
        financas.addContas(conta);
        String expected = "Nome:Luz Valor: 150.0";
        String result = financas.FolhaDePagamento("Luz");
        Assert.assertEquals(expected, result);
    }
    @Test(expected = Exception.class)
    public void testFolhaPagamentoThrowsError () throws Exception {
        financas.FolhaDePagamento(null);
    }

    @Test
    public void testBalancoContas () throws Exception {
        Contas gas = new Contas("Gas", 100.00);
        financas.addContas(conta);
        financas.addContas(gas);

        String expected = "Disponível: 500.0 Contas a pagar: 250.0 Após pagamentos: 250.0";
        Assert.assertEquals(expected, financas.balancoContas());

    }
    @Test(expected = Exception.class)
    public void testShouldThrowException () throws Exception {
        financas.setContas(null);
    }
    @Test(expected = Exception.class)
    public void testIsNotNull () throws Exception {
        financas.addContas(null);
    }
}
