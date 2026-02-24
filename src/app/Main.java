package app;

import model.Contato;
import service.Agenda;

import java.util.List;
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
            System.out.println("4 - Editar Contato");
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
                        mostrarContatos(agenda);
                    }
                    break;

                case 3:
                    if(agenda.hasContacts()){
                        mostrarContatos(agenda);
                        System.out.println("Digite o número do contato a ser removido:");
                        int indiceRemocao = inputValidation(scanner);
                        if(agenda.removeContact(indiceRemocao)){
                            System.out.println("Contato removido com sucesso!");
                        } else{
                            System.out.println("Índice inválido!");
                        }
                    }
                    break;

                case 4:
                    if(agenda.hasContacts()){
                        mostrarContatos(agenda);
                        System.out.println("Digite o indice do contato a ser editado:");
                        int indice = inputValidation(scanner);
                        System.out.println("Digite o novo nome do contato: ");
                        String novoNome = scanner.nextLine();
                        System.out.println("Digite o novo telefone do contato: ");
                        String novoTelefone = scanner.nextLine();
                        System.out.println("Digite o novo email do contato: ");
                        String novoEmail = scanner.nextLine();
                        if (agenda.editContact(indice, novoNome, novoTelefone, novoEmail)){
                            System.out.println("Contato editado com sucesso!");
                        } else {
                            System.out.println("Índice inválido");
                        }
                    }
                    break;

                case 0:
                    break;
            }
        }
    scanner.close();
    }

    private static int inputValidation(Scanner scanner){
        try{
            return Integer.parseInt(scanner.nextLine());
        } catch(NumberFormatException e){
            System.out.println("Valor inválido, tente novamente!");
            System.out.println();
            return -1;
        }
    }

    private static void mostrarContatos(Agenda agenda) {
        List<Contato> contatos = agenda.getContacts();

        for (int i = 0; i < contatos.size(); i++) {
            System.out.println(i + " - " + contatos.get(i));
        }
        System.out.println();
    }
}