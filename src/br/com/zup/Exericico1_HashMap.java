package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exericico1_HashMap {

    public static void main(String[] args) {
        Map<String, Double> produtos = new HashMap<String, Double>();
        Scanner leitor = new Scanner(System.in);

        System.out.println("_________Bem vindo ao Gerenciador de Produtos DRB__________");

        int selecionar = 0;
        String nome = null;




        int retorno = 0;
        do {
            System.out.println("Menu inicial");
            System.out.println("Opção 1: Adicionar produto e seu preço.");
            System.out.println("Opção 2: Exibir produtos cadastrados.");
            System.out.println("Opção 3: Excluir produto usando o nome.");

            System.out.println("Digite a opção desejada: ");
            selecionar = leitor.nextInt();
            leitor.nextLine();

            switch (selecionar) {
                case 1:
                    System.out.println("Digite o nome do produto a ser inserido.");
                    nome = leitor.nextLine();
                    System.out.println("Digite o preço do produto.");
                    Double preco = leitor.nextDouble();


                    produtos.put(nome, preco);

                    System.out.println("Digite 1 para voltar ao Menu inicial e 0 para finalizar!");
                    retorno = leitor.nextInt();
                    leitor.nextLine();

                    break;
                case 2:
                    System.out.println("Lista de Produtos:" + produtos );

                    System.out.println("Digite 1 para voltar ao Menu inicial e 0 para finalizar!");
                    retorno = leitor.nextInt();

                    break;

                case 3:
                    System.out.println("Digite o Nome do produto que deseja excluir os dados: ");
                    nome = leitor.nextLine();
                    produtos.remove(nome);
                    System.out.println("Dados removidos com sucesso!");

                    System.out.println("Digite 1 para voltar ao Menu inicial e 0 para finalizar!");
                    retorno = leitor.nextInt();
                    leitor.nextLine();
                    break;

            }
        } while (retorno == 1);

    }}