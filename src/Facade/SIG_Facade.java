package Facade;

import Domain.*;
import Entities.*;

import java.util.ArrayList;

public class SIG_Facade {
    private String[] disciplinas;
    private Infra infra;
    private Financas financas;
    private Almoxarifado almoxarifado;
    private Administracao administracao;
    private Professor professor;
    private Aluno aluno;
    private Salas salas;
    private Contas contas;

    public SIG_Facade () {
        this.infra = new Infra();
        this.financas = new Financas();
        this.almoxarifado = new Almoxarifado();
        this.administracao = new Administracao();
        this.professor = new Professor();
        this.aluno = new Aluno();
        this.salas = new Salas();
    }
    public void Entrevistas_Reunioes (String data, String tipo) throws Exception {
        if (tipo.equals("reuniao")) {
            administracao.agendarReuniaoDiretoria(data);
        } else {
            administracao.agendarEntrevista(data);
        }

        System.out.println("AGENDA DA ADMINISTRAÇÃO");
        System.out.println(administracao);
    }
    public void BalancoContas_FolhaDePagamento (double valor_disponivel_em_caixa) throws Exception {
        financas.setCaixa(valor_disponivel_em_caixa);
        financas.addContas(new Contas("Gas", 120.00));
        financas.addContas(new Contas("Luz", 150.00));
        financas.addContas(new Contas("Agua", 69.00));

        System.out.println("FOLHA DE PAGAMENTO");
        System.out.println(financas.FolhaDePagamento("Gas"));

        System.out.println("BALANÇO DE CONTAS");
        System.out.println(financas.balancoContas());
    }
    public void Alocacoes_TempoDeCasaProfessor (String nome, int matricula, String[] disciplinas, int tempoDeCasa) throws Exception {
        professor.setNome(nome);
        professor.setMatricula(matricula);
        professor.setDisciplinas(disciplinas);
        professor.setTempoDeCasa(tempoDeCasa);

        System.out.println("DADOS DO PROFESSOR");
        System.out.println(professor);
    }
    public void Historico_RDM_Alunos (String nome_aluno, int matricula, String[] disciplinas, String[] historico) {
        aluno.setNome(nome_aluno);
        aluno.setMatricula(matricula);
        aluno.setDisciplinas(disciplinas);
        aluno.setHistorico(historico);

        System.out.println("DADOS DOS ALUNOS");
        System.out.println(aluno);
    }
    public void Estoque_Pedido_de_Compra (String[] pedido, ArrayList<String> produtos) throws Exception {
        almoxarifado.setPedidoDeCompra(pedido);
        almoxarifado.addProdutos(produtos);

        System.out.println("DADOS DO ALMOXARIFADO");
        System.out.println(almoxarifado);
        System.out.println();
    }
    public void AlocacaoDeSalas (String nome, int capacidade) throws Exception {
        salas.setNome_sala(nome);
        salas.setCapacidade_sala(capacidade);
        ArrayList<Salas> salas_aula = new ArrayList<>();
        salas_aula.add(salas);
        infra.addSalas(salas_aula);

        System.out.println("DADOS DAS SALAS");
        System.out.println(infra);

    }
}
