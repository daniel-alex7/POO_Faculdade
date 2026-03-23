package com.mycompany.torneioaula5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
- nome: string
- idade: int
Torneio(nome: string, idade: int)
getNome(): string
getIdade (): int
setNome(n: string): void
setIdade(i: int): void
verificaCategoria(): string
imprimeDados(): void

 */
public class Torneio {
    String nome;
    int idade;
    
    Torneio(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public void setIdade(int i){
        idade = i;
    }
    
    String verificarCategoria() {
        if(idade > 5 && idade < 7){
           return "Infatil";
        }
        else if(idade > 8 && idade < 10){
            return "Juvenil";
        }
        else if (idade > 11 && idade < 15){
            return"Adolescente";
        }
        else if(idade > 16 && idade < 30){
            return "Adulto";
        }
        else if(idade > 30){
            return "Senior";
        }
        else{
            return "Nada";
        }
    }
    
    void ImprimirDados(){
        System.out.println("O "+ nome +" vai competir na categoria: " + verificarCategoria());
    }
}
        
    

