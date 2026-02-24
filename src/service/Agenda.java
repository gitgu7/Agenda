package service;

import java.util.ArrayList;
import java.util.List;

import model.Contato;

public class Agenda {

    ArrayList<Contato> lista = new ArrayList<>();

    public void addContact(Contato contato){
        lista.add(contato);
    }

    public boolean removeContact(int y){
        if(y >= 0 && y < lista.size()){
            lista.remove(y);
            return true;
        } else {
            return false;
        }
    }

    public List<Contato> getContacts() {
        return lista;
    }

    public boolean editContact(int indice, String nome, String telefone, String email){
        if(indice >= 0 && indice < lista.size()){
            Contato contato = lista.get(indice);
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);
            return true;
        } else {
            return false;
        }
    }

    public boolean hasContacts(){
        return !lista.isEmpty();
    }
}