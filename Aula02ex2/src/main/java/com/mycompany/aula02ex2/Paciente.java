package com.mycompany.aula02ex2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Silva
 */
public class Paciente {
    String nome;
    String rg;
    String endereco;
    String telefone;
    String datanas;
    String profissao;
    
    public Paciente(){}
    
    
    public Paciente(String nome, String rg, String endereco, String telefone, String datanas, String profissao){
            this.nome = nome;
            this.rg = rg;
            this.endereco = endereco;
            this.telefone = telefone;
            this.datanas = datanas;
            this.profissao = profissao;
                    
            
        }
    
    void imprimeDados(){
            System.out.println("------------------");
            System.out.println("Dados cadastrados");
            System.out.println("Nome: " + nome);
            System.out.println("RG: " + rg);
            System.out.println("Endereço: " + endereco);
            System.out.println("Telefone: " + telefone);
            System.out.println("Data de Nascimento: " + datanas);
            System.out.println("Profissao: " + profissao);
            
            
        }
}
