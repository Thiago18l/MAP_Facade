package Domain;

import utils.Estoque;

import java.util.ArrayList;
import java.util.Arrays;

public class Almoxarifado implements Estoque {
    private ArrayList<String> produtos;
    private String[] pedidoDeCompra;
    public Almoxarifado () {}

    public void addProdutos (ArrayList<String> produto) throws Exception {
        if (produto == null) {
            throw new Exception("Produtos não podem ser nulos");
        }
        this.produtos = produto;
    }

    public ArrayList<String> getProdutos() {
        return produtos;
    }

    public String[] getPedidoDeCompra() {
        return pedidoDeCompra;
    }

    public void setPedidoDeCompra(String[] pedidoDeCompra) {
        this.pedidoDeCompra = pedidoDeCompra;
    }

    public String[] getEstoque () throws Exception {
        String[] produtos = new String[this.produtos.size()];
        for (int i = 0; i < produtos.length; i++) {
            produtos[i] = this.produtos.get(i);
        }
        if (produtos[0] == null) {
            throw new Exception("Produtos não podem ser null");
        }
        return produtos;
    }
    @Override
    public String estoque() throws Exception {
        String[] products = getEstoque();
        return Arrays.toString(products);
    }
    @Override
    public void pedidoDeCompra(String[] pedido) {
        this.pedidoDeCompra = pedido;
    }
    @Override
    public String toString() {
        String value = "";
        try {
            String[] products = getEstoque();
            value = "Almoxarifado " +
                    "produtos=" + Arrays.toString(products) +
                    ", pedidoDeCompra=" + Arrays.toString(pedidoDeCompra);
        } catch (Exception e) {
            e.getMessage();
        }

        return value;
    }
}
