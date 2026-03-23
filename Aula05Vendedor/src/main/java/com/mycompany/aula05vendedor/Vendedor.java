package com.mycompany.aula05vendedor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
- vendas: float
- salario: float
- nome: String
- falta: int
Vendedor (v:float, s:float,n:String, f: int)
setVendas(v: float): void
getVendas( ): float
setSalario(s: float): void
getSalario(): float
setNome(n: string): void
getNome() : string
setFalta(f: int): void
getFalta( ): int

imprimirDados(): void
calcularSalario(): void
calcularComissao(): float
descontoFalta(): float
 */
public class Vendedor {
    float vendas;
    float salario;
    String nome;
    int falta;
    
    Vendedor(float vendas, float salario, String nome, int falta){
        this.vendas = vendas;
        this.salario = salario;
        this.nome  = nome;
        this.falta = falta;
    }
    
    public float getVendas(){
        return vendas;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getFaltas(){
        return falta;
    }
    
    public void setVendas(float v){
        vendas = v;
    }
    
    public void setSalario(float s){
        salario = s;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
     public void setFalta(int f){
        falta = f;
    }
     
}
