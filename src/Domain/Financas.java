package Domain;

import Entities.Contas;
import utils.Pagamento;

import java.util.ArrayList;


public class Financas implements Pagamento {
    private ArrayList<Contas> contas = new ArrayList<>();
    private double caixa;

    public Financas () {}
    public Financas (double caixa) {
        this.caixa = caixa;
    }
    public void addContas (Contas contas) throws Exception {
        if (contas == null) {
            throw new Exception("CONTA NÃO PODE SER NULL");
        }
        this.contas.add(contas);
    }
    private Contas BuscaConta (String nome_da_conta) {
        Contas conta_qualquer = null;
        for (Contas conta : contas) {
            if (conta.getNome().compareTo(nome_da_conta) == 0) {
                conta_qualquer = conta;
            }
        }
        return conta_qualquer;
    }

    public void setContas(ArrayList<Contas> contas) throws Exception {
        if (contas == null) {
            throw new Exception("ArrayList de contas não pode ser null");
        }
        this.contas = contas;
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }

    @Override
    public String FolhaDePagamento(String nome_conta) throws Exception {
        if (nome_conta == null) {
            throw new Exception("Nome da conta não pode ser null");
        }
        Contas contas_a_pagar = BuscaConta(nome_conta);

        return "Nome:" + contas_a_pagar.getNome() + " "
                + "Valor: " + contas_a_pagar.getValor_conta();
    }

    @Override
    public String balancoContas() throws Exception {
        double valor_contas_geral = 0;
        for (Contas contas : this.contas) {
            valor_contas_geral += contas.getValor_conta();
        }
        double valor_caixa_apos_pagamento = caixa - valor_contas_geral;
        if (valor_contas_geral > caixa) {
            throw new Exception("Saldo insuficiente para pagar as contas");
        }
        return "Disponível: " + this.caixa +
                " Contas a pagar: " + valor_contas_geral +
                " Após pagamentos: " + valor_caixa_apos_pagamento;
    }

    @Override
    public String toString() {
        return "Financas " +
                "caixa=" + caixa;
    }
}
