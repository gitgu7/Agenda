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

            option = inputValidation(scanner);

            switch (option){
                case 1:
                    System.out.println("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o telefone do contato: ");
                    String telefone = scanner.nextLine();
                    System.out.println("Digite o email do contato: ");
                    String email = scanner.nextLine();
                    Contato contato = new Contato(nome, telefone, email);
                    agenda.addContact(contato);
                    break;

                case 2:
                    if(agenda.hasContacts()){
                        agenda.showContacts();
                    }
                    break;

                case 3:
                    if(agenda.hasContacts()){
                        agenda.showContacts();
                        System.out.println("Digite o número do contato a ser removido:");
                        int y = inputValidation(scanner);
                        agenda.removeContact(y);
                    }
                    break;

                case 0:
                    option = 0;
            }
        }
    scanner.close();
    }

    private static int inputValidation(Scanner scanner){
        try{
            int x = Integer.parseInt(scanner.nextLine());
            return x;
        } catch(NumberFormatException e){
            System.out.println("Valor inválido, tente novamente!");
            return -1;
        }
    }
}