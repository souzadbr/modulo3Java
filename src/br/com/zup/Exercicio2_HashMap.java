package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio2_HashMap {
    public static void main(String[] args) {
        /*
        2. Crie um programa para gerenciar uma lista de candidatos de um vestibular,
        cada candidato tem número de matrícula e uma nota. No final do programa, o usuário deve
        decidir se irá adicionar mais de um candidato,exibir todos os candidatos cadastrados
        ou excluir um candidato pelo número de matrícula.
         */
        Map<Integer,Integer> candidatos = new HashMap<Integer,Integer>();
        Scanner leitor = new Scanner(System.in);

        int escolha = 0;
        int retorno = 1;
        do {
            System.out.println("-----------Gerenciador de candidatos DBR -------------");
            System.out.println("Menu");
            System.out.println("Opcão 1: Adicionar candidato.");
            System.out.println("Opção 2: Exibir lista de candidados cadastrados.");
            System.out.println("Opção 3: Excluir um candidato pelo número da matrícula.");
            System.out.println("Opção 4: Sair");

            System.out.println("Digite sua opção: ");
            escolha = leitor.nextInt();

          if (escolha == 1)  {
              System.out.println("Digite número de matricula do candidato: ");
              Integer matricula = leitor.nextInt();
              System.out.println("Digite a nota do candidato: ");
              Integer nota = leitor.nextInt();

              candidatos.put ( matricula, nota );
          }
          else if (escolha == 2){
              System.out.println("A lista de candidatos é: ");
              for (Integer chaveCandidatos: candidatos.keySet()) {
                  System.out.println(chaveCandidatos + "\t" + candidatos.get(chaveCandidatos));
              }


          }
          else if (escolha == 3){
              System.out.println("digite a matricula que deseja excluir os dados: ");
              Integer matricula = leitor.nextInt();;

              candidatos.remove (matricula);
              System.out.println("Dados removidos com sucesso!");

          }
          else if (escolha == 4){
              System.out.println("Programa encerrado");
              System.exit(0);
          }


        } while (retorno != 0);
    }
}