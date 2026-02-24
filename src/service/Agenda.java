package service;

import java.util.ArrayList;
import model.Contato;

public class Agenda {

    ArrayList<Contato> lista = new ArrayList<>();

    public void addContact(Contato contato){
        lista.add(contato);
    }

    public void removeContact(int y){
        if(y >= 0 && y < lista.size()){
            lista.remove(y);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void showContacts(){
        int x = 0;

        for(Contato contato : lista) {
            System.out.println();
            System.out.print(x + " - ");
            System.out.print(contato);
            x++;
        }
        System.out.println();
        System.out.println();
    }

    public void editContact(int indice, String nome, String telefone, String email){
        if(indice >= 0 && indice < lista.size()){
            Contato contato = lista.get(indice);
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);
            System.out.println("Contato editado com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public boolean hasContacts(){
        return !lista.isEmpty();
    }
}