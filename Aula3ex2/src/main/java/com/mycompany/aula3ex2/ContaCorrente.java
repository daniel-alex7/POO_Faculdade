package com.mycompany.aula3ex2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Silva
 */
import java.util.Scanner;

public class ContaCorrente {
    // Atributos
    public String nome;
    public float saldo;
    public float limite;
    public char tipo;

    // Construtor 1: Com todos os parâmetros
    public ContaCorrente(String n, float s, float l, char t) {
        this.nome = n;
        this.saldo = s;
        this.limite = l;
        this.tipo = t;
    }

    // Construtor 2: Com nome, saldo e tipo
    public ContaCorrente(String n, float s, char t) {
        this.nome = n;
        this.saldo = s;
        this.tipo = t;
        this.limite = 0; // Valor padrão caso não informado
    }

    // Construtor 3: Padrão (sem parâmetros)
    public ContaCorrente() {
    }

    // Método para cadastrar dados via console
    public void cadastraDados() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("--- Cadastro de Conta ---");
        System.out.print("Nome: ");
        this.nome = leitor.nextLine();
        System.out.print("Saldo Inicial: ");
        this.saldo = leitor.nextFloat();
        System.out.print("Limite: ");
        this.limite = leitor.nextFloat();
        System.out.print("Tipo (C para Comum, E para Especial): ");
        this.tipo = leitor.next().charAt(0);
    }

    // Método para retornar os dados da conta em formato String
    public String imprimeDados() {
        return "Conta [Titular: " + nome + ", Saldo: R$ " + saldo + 
               ", Limite: R$ " + limite + ", Tipo: " + tipo + "]";
    }

    // Método para realizar depósito
    public void depositar(float valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }
    }

    // Método para realizar saque
    public void sacar(float valor) {
        if (valor <= (this.saldo + this.limite)) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}