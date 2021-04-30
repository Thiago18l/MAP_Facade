import Facade.*;
import utils.Utils;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws Exception {
        SIG_Facade facade = new SIG_Facade();
        Utils disciplinas = new Utils();
        Utils historico = new Utils();
        Utils pedidos = new Utils();
        Utils produtos = new Utils();
        historico.add("Matemática, 10");
        historico.add("Português, 10");
        disciplinas.add("Matemática");
        disciplinas.add("Português");
        pedidos.add("Livro");
        pedidos.add("Caneta");
        produtos.listAdd("Caderno");

        //ADMINISTRATIVA
        facade.Entrevistas_Reunioes("25/04/2021","reuniao");
        facade.Entrevistas_Reunioes("25/04/2021","entrevista");
        System.out.println(facade.Entrevistas_Reunioes("26/04/2021","reuniao"));

        //FINANCEIRO
        System.out.println(facade.BalancoContas_FolhaDePagamento(5000));
        //PROFESSOR
        System.out.println(facade.Alocacoes_TempoDeCasaProfessor("Marcos",
                1, disciplinas.getArray(),1));

        //ALUNOS
        System.out.println(facade.Historico_RDM_Alunos("Lucas",
                2,disciplinas.getArray(), historico.getArray()));

        //ALMOXORIFADO
        System.out.println(facade.Estoque_Pedido_de_Compra(pedidos.getArray(),
                produtos.getList()));

        //INFRA
        System.out.println(facade.AlocacaoDeSalas("lab 07",
                30));
    }
}
