/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula3ex2;

/**
 *
 * @author Daniel Silva
 */
public class Aula3ex2 {

      public static void main(String[] args) {
        // Objeto 1: Usando o construtor completo
        ContaCorrente conta1 = new ContaCorrente("Eduardo Silva", 1000.00f, 500.00f, 'E');
        
        // Objeto 2: Usando o construtor vazio e o método cadastraDados()
        ContaCorrente conta2 = new ContaCorrente();
        conta2.cadastraDados();

        System.out.println("\n--- Estado Inicial das Contas ---");
        System.out.println(conta1.imprimeDados());
        System.out.println(conta2.imprimeDados());

        // Utilizando os métodos de depósito e saque no Objeto 1
        System.out.println("\n--- Movimentações Conta 1 ---");
        conta1.depositar(200.00f);
        conta1.sacar(100.00f);
        System.out.println("Novo estado: " + conta1.imprimeDados());

        // Utilizando os métodos no Objeto 2
        System.out.println("\n--- Movimentações Conta 2 ---");
        conta2.sacar(50.00f);
        System.out.println("Novo estado: " + conta2.imprimeDados());
    }
}
