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
                    Contato contato = new Contato();
                    System.out.println("Digite o nome do contato: ");
                    contato.setNome(scanner.nextLine());
                    System.out.println("Digite o telefone do contato: ");
                    contato.setTelefone(scanner.nextLine());
                    System.out.println("Digite o email do contato: ");
                    contato.setEmail(scanner.nextLine());
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