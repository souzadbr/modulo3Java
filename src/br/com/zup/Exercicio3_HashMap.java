package br.com.zup;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio3_HashMap {
    public static void main(String[] args) {

        Map<String, String> cardapio = new HashMap<String, String>();
        Scanner leitor = new Scanner(System.in);

        int escolha = 0;
        int retorno =1;
        String nomePrato = null;
        String ingredientes = null;

        do {
            System.out.println("---------Bem vindo ao Gerenciador de cardapio DBR--------");
            System.out.println("Menu:");
            System.out.println("Opção 1: Adicionar um prato ao carrinho.");
            System.out.println("Opção 2: Exibir todos os pratos adicionados.");
            System.out.println("Opção 3: Excluir um prato pelo nome.");
            System.out.println("Opção 4: Sair.");


            System.out.println("Escolha a opção desejada:");
            escolha = leitor.nextInt();
            leitor.nextLine();

            if (escolha == 4 ){
                break;
            }

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do prato que deseja:");
                    nomePrato = leitor.nextLine();
                    System.out.println("Digite os ingredientes que deseja seprandos por vírgula:");
                    ingredientes = leitor.nextLine();

                    cardapio.put(nomePrato, ingredientes);

                    break;
                case 2:
                    System.out.println("Esse são os pratos atualmente no carrinho.");
                    for (String chaveCardapio:cardapio.keySet()) {
                        System.out.println(chaveCardapio + "\t\t" + cardapio.get(chaveCardapio));
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do prato que deseja excluir:");
                    nomePrato = leitor.nextLine();

                    cardapio.remove(nomePrato);

                    break;

            }


        }while (retorno !=0);
    }
}

