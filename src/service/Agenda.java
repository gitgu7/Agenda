package service;

import java.util.ArrayList;
import model.Contato;

public class Agenda {

    ArrayList<Contato> lista = new ArrayList<>();

    public void addContact(Contato contato){
        lista.add(contato);
    }

    public void removeContact(int y){
        if(!lista.isEmpty() && y >= 0 && y < lista.size()){
            lista.remove(y);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void showContacts(){
        int x = 0;

        if(lista.isEmpty()){
            System.out.println("você não tem nenhum contato.");
        } else {
            for(Contato contato : lista) {
                System.out.println();
                System.out.print(x + " - ");
                System.out.print(contato);
                x++;
            }
            System.out.println();
        }
    }
}