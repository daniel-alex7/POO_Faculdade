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
    private float vendas;
    private float salario;
    private String nome;
    private int falta;
    
    Vendedor(float vendas, float salario, String nome, int falta){
        this.vendas = vendas;
        this.salario = salario;
        this.nome  = nome;
        this.falta = falta;
    }
    
    
    public float getVendas(){ return vendas; }
    public float getSalario(){ return salario; }
    public String getNome(){ return nome; }
    public int getFalta(){ return falta; }
    
    public void setVendas(float v){ vendas = v; }
    public void setSalario(float s){ salario = s; }
    public void setNome(String n){ nome = n; }
    public void setFalta(int f){ falta = f; }
     
    void imprimeDados(){
            System.out.println("------------------");
            System.out.println("------------------");
            System.out.println("Dados cadastrados");
            System.out.println("Nome: " + nome);
            System.out.println("Salario: " + salario);
            System.out.println("Vendas: " + vendas);
            System.out.println("Faltas: " + falta);
        }
    
    public void calculaSalario(){
        float salarioFinal = salario + calculaComissao()- descontoFalta();
        System.out.println("O cálculo do salário final é: R$ " + salarioFinal);
  
     }
    
    public float calculaComissao(){
        if(vendas >= 1000 && vendas <= 2000){
            return vendas*0.10f;
        }
        if(vendas >= 2000){
            return vendas*0.15f;
        }
        return 0;
    }
    
    
    public float descontoFalta(){
           return (salario/30)*falta;
    }
     
}
