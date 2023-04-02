/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menuthemis;
import java.util.Scanner;
        
/**
 *
 * @author Renan
 */
public class MenuThemis {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        
            System.out.println("Bem vindo! Escolha uma das opções!");
            System.out.println("1 - Cadastrar um Processo Civil.");
            System.out.println("2 - Acessar Resumo de um processo");
            System.out.println("3 - Agendar uma Audiência.");
            System.out.println("4 - Inserir comentário em um processo");
            System.out.println("5 - Adicionar um Lembrete.");
            System.out.println("6 - Finalizar um Processo.");
            System.out.println("7 - Sair");
            int opcao = teclado.nextInt();

            switch (opcao) {
            case 1 -> {
                 System.out.println("Você escolheu Cadastrar um Processo Civil.");
            }
            
            case 2 -> {
                 System.out.println("Você escolheu Acessar Resumo.");
            }
            case 3 -> {
                 System.out.println("Você escolheu Agendar uma Audiência.");
            }
            case 4 -> {
                 System.out.println("Você escolheu inserir um comentário.");
            }
            case 5 -> {
                 System.out.println("Você escolheu Adicionar um Lembrete.");
            }
             case 6 -> {
                 System.out.println("Você escolheu Finalizar um Processo.");
            }
             case 7 -> {
                 System.out.println("Você escolheu Sair");
            }
            
            default -> System.out.println("Opção Invalida!");
        }   
    }
}
