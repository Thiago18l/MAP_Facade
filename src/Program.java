import Facade.SIG_Facade;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws Exception {
        SIG_Facade facade = new SIG_Facade();
        String[] historico = new String[2];
        String[] disciplinas = new String[2];
        ArrayList<String> produtos= new ArrayList<>();
        String[] pedido = new String[2];


        //ADMINISTRATIVA
        facade.Entrevistas_Reunioes("25/04/2021","reuniao");
        facade.Entrevistas_Reunioes("25/04/2021","entrevista");
        facade.Entrevistas_Reunioes("26/04/2021","reuniao");

        //FINANCEIRO
        facade.BalancoContas_FolhaDePagamento(5000);
        //PROFESSOR
        disciplinas[0] = "Matemática";
        disciplinas[1] = "Calculo 1";
        facade.Alocacoes_TempoDeCasaProfessor("Marcos",1, disciplinas,1);

        //ALUNOS
        historico[0] = "Matemática, 10";
        historico[1] = "Português, 10";
        facade.Historico_RDM_Alunos("Lucas",2,disciplinas,historico);

        //ALMOXORIFADO
        produtos.add("lapis");
        pedido[0] = "livro";
        pedido[1] = "caneta";
        facade.Estoque_Pedido_de_Compra(pedido,produtos);

        //INFRA
        facade.AlocacaoDeSalas("lab 07", 30);

    }
}
