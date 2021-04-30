package test;

import Facade.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Facade_test {
    SIG_Facade facade = new SIG_Facade();
    String[] historico;
    String[] disciplinas;
    ArrayList<String> produtos;
    String[] pedido;
    @Before
    public void instanciaClasse () {
        historico =  new String[2];
        disciplinas = new String[2];
        produtos = new ArrayList<>();
        pedido = new String[2];
    }

    @Test
    public void testAgendamentoReunioes () throws Exception {

        facade.Entrevistas_Reunioes("25/04/2021","reuniao");
        facade.Entrevistas_Reunioes("25/04/2021","entrevista");

        String expected = "Administração Reuniões Agendadas: [25/04/2021, 26/04/2021] entrevistas Agendadas:[25/04/2021]";
        Assert.assertEquals(expected,facade.Entrevistas_Reunioes("26/04/2021","reuniao"));
    }

    @Test
    public void testBalancoContas_FolhaDePagamento() throws Exception{
        String expected = "BALANÇO DE CONTAS: Disponível: 5000.0 Contas a pagar: 339.0 Após pagamentos: 4661.0 FOLHA DE PAGAMENTO: Nome:Gas Valor: 120.0";
        Assert.assertEquals(expected,  facade.BalancoContas_FolhaDePagamento(5000));
    }

    @Test
    public void testAlocacoes_TempoDeCasaProfessor() throws Exception{
        disciplinas[0] = "Matemática";
        disciplinas[1] = "Calculo 1";
        String expected = "DADOS DO PROFESSOR Professor: nome = Marcos', matricula = 1, disciplinas = [Matemática, Calculo 1], tempoDeCasa = 1 ano";
        String facadeProfessorActual = facade.Alocacoes_TempoDeCasaProfessor("Marcos",1, disciplinas,1);
        Assert.assertEquals(expected,  facadeProfessorActual);
    }

    @Test
    public void testHistorico_RDM_Alunos() throws Exception{
        historico[0] = "Matemática, 10";
        historico[1] = "Português, 10";
        disciplinas[0] = "BANCO DE DADOS";
        disciplinas[1] = "MAP";
        String expected = "Aluno disciplinas=[BANCO DE DADOS, MAP], historico=[Matemática, 10, Português, 10], nome='Lucas', matricula=2";
        String actual = facade.Historico_RDM_Alunos("Lucas",2, disciplinas , historico);
        Assert.assertEquals(expected,  actual);
    }

    @Test
    public void testEstoque_Pedido_de_Compra() throws Exception{
        produtos.add("lapis");
        pedido[0] = "livro";
        pedido[1] = "caneta";
        String expected = "Almoxarifado produtos=[lapis], pedidoDeCompra=[livro, caneta]";
        String actual =  facade.Estoque_Pedido_de_Compra(pedido,produtos);
        Assert.assertEquals(expected,  actual);
    }
    @Test
    public void testAlocacaoDeSalas() throws Exception{
        String expected = "Infra{salas=[Salas {nome_sala='lab 07', capacidade_sala=30, status=false}]}";
        String actual = facade.AlocacaoDeSalas("lab 07", 30);
        Assert.assertEquals(expected,  actual);
    }
}
