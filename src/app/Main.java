package app;

import model.Contato;
import service.Agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int option = -1;

        while (option != 0){
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Listar Contatos");
            System.out.println("3 - Excluir Contato");
            System.out.println("0 - Sair");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    Contato contato = new Contato();
                    System.out.println("Digite o nome do contato: ");
                    contato.setNome(scanner.nextLine());
                    System.out.println("Digite o telefone do contato: ");
                    contato.setTelefone(scanner.nextLong());
                    scanner.nextLine();
                    System.out.println("Digite o email do contato: ");
                    contato.setEmail(scanner.nextLine());
                    agenda.addContact(contato);
                    break;

                case 2:
                    agenda.showContacts();
                    break;

                case 3:
                    int y = -1;
                    agenda.showContacts();
                    agenda.removeContact(y);
                    break;

                case 0:
                    option = 0;
            }

        }
    scanner.close();
    }
}