package Domain;

import Entities.Salas;

import java.util.ArrayList;
import java.util.Arrays;

public class Infra {
    private ArrayList<Salas> salas;

    public Infra () {}

    public void addSalas (ArrayList<Salas> sala) throws Exception {
        if (sala == null) {
            throw new Exception("Salas não podem ser nulas");
        }
        this.salas = sala;
    }
    public Salas getSalas (String nome_sala) {
        Salas sala = null;
        for (Salas salas : salas) {
            if (salas.getNome_sala().compareTo(nome_sala) == 0) {
                sala = salas;
            }
        }
        return sala;
    }
    public void alocacaoDeSalas (String nome_sala) throws Exception {
        if (nome_sala == null) {
            throw new Exception("Nome da sala não pode ser nulo");
        }
        Salas salinha = getSalas(nome_sala);
        if (!salinha.isStatus()) {
            salinha.ocuparSala();
        } else {
            throw new Exception("Sala ocupada!");
        }
    }
    public void desocuparSala (String nome_sala) throws Exception {
        if (nome_sala == null) {
            throw new Exception("O nome da sala não pode ser nulo");
        }
        Salas salinha = getSalas(nome_sala);
        if (salinha.isStatus()) {
            salinha.desocuparSala();
        } else {
            throw new Exception("Sala já está desocupada");
        }
    }
    public Salas[] getAllSalas () throws Exception {
        Salas[] salas = new Salas[this.salas.size()];
        for (int i = 0; i < salas.length; i++) {
            salas[i] = this.salas.get(i);
        }
        if (salas[0] == null) {
            throw new Exception("Produtos não podem ser null");
        }
        return salas;
    }

    @Override
    public String toString() {
        String value = "";
        try {
            Salas[] salas = getAllSalas();
            value =  "Infra{" +
                    "salas=" + Arrays.toString(salas) +
                    '}';
        } catch (Exception e) {
            e.getMessage();
        }
        return value;
    }



}
