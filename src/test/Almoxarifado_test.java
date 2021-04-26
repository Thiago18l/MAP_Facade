package test;

import Domain.Almoxarifado;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Almoxarifado_test {
    private Almoxarifado almoxarifado;
    private ArrayList<String> produtos;
    @Before
    public void instanciaClasse () {
        almoxarifado = new Almoxarifado();
        produtos = new ArrayList<>();
    }
    @Test
    public void testAddProdutos () throws Exception {
        produtos.add("Caderno");
        almoxarifado.addProdutos(produtos);
        String expected = "[Caderno]";
        Assert.assertEquals(expected, almoxarifado.estoque());
    }
    @Test(expected = Exception.class)
    public void testSeForNulo () throws Exception {
        almoxarifado.addProdutos(null);
    }
}
