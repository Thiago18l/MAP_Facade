package Domain;

import java.util.ArrayList;
import java.util.Arrays;

public class Administracao {
    private ArrayList<String> reunioesComDiretoria = new ArrayList<>();
    private ArrayList<String> entrevistasAgendadas = new ArrayList<>();
    public Administracao () {}

    public void agendarReuniaoDiretoria (String data) throws Exception {
        if (data == null) {
            throw new Exception("Data não pode ser nulo");
        }
        this.reunioesComDiretoria.add(data);
    }
    public void agendarEntrevista (String data) throws Exception {
        if (data == null) {
            throw new Exception("Data não pode ser nulo");
        }
        this.entrevistasAgendadas.add(data);
    }
    public String[] reunioesDiretoria () throws Exception {
        String[] reunioes = new String[reunioesComDiretoria.size()];
        for (int i = 0; i < reunioes.length; i++) {
            reunioes[i] = reunioesComDiretoria.get(i);
        }
        if (reunioes[0] == null) {
            throw new Exception("reuniões não podem ser null!");
        }
        return reunioes;
    }
    public String[] entrevistas() throws Exception {
        String[] entrevistas =  new String[entrevistasAgendadas.size()];
        for (int i = 0; i < entrevistas.length; i++) {
            entrevistas[i] = entrevistasAgendadas.get(i);
        }
        if (entrevistas[0] == null) {
            throw new Exception("Entrevista não podem ser null!");
        }
        return entrevistas;
    }
    @Override
    public String toString() {
        String valor = "";
        try {
            String[] reunioes = reunioesDiretoria();
            String[] entrevistas = entrevistas();
            valor = "Administração " +
                    "Reuniões Agendadas: " + Arrays.toString(reunioes) +
                    " entrevistas Agendadas:" + Arrays.toString(entrevistas);
        } catch (Exception e) {
            e.getMessage();
        }
        return valor;
    }
}
