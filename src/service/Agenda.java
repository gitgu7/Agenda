package service;

import java.util.Scanner;
import java.util.ArrayList;
import model.Contato;

public class Agenda {

    ArrayList<Contato> lista = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addContact(Contato contato){
        lista.add(contato);
    }

    public void removeContact(int y){
        if(lista.isEmpty()){} else {
            System.out.println("Digite o número do contato a ser removido:");
            y = scanner.nextInt();
            lista.remove(y);
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
                System.out.println(contato);
                x++;
            }
            System.out.println();
        }
    }
}