package com.mycompany.aula04;
import java.util.Scanner;


public class Funcionario {
    private int cracha;
    float salario;
    String cargo;
    
    
    Funcionario(){
        this.cargo = "Analista";
    }
    
    Funcionario(int cracha, float salario, String cargo) {
        this.cracha = cracha;
        this.salario = salario;
        this.cargo = cargo;
        
    }
    
    int getCracha(){
        return cracha;
    }
    
    float getSalario(){
        return salario;
    }
    
    String getCargo(){
        return cargo;
    }
    
    void setCracha(int c){
        cracha = c;
    }
    
    void setSalario(float s){
        salario = s;
    }
    
    void setCargo(String car){
        cargo = car;
    }
    
    
    
    float calcularAumento(float porcentagem){
        return (salario * porcentagem) + salario;
        
    }
    
    public float calcularAumento(int tempo){
        return salario + (150 * tempo);
    }
    
    
    void calcularAumento(Funcionario f){
        if(f.salario > this.salario){
            this.salario = f.salario;
        }   
    }

    
    //retorno de objeto
    Funcionario duplicar(){
        Funcionario f = new Funcionario();
        f.cracha = this.cracha;
        f.salario = this.salario;
        f.cargo = this.cargo;
        return f;
    
    }

    
}

