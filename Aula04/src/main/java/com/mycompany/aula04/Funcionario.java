package com.mycompany.aula04;
import java.util.Scanner;


public class Funcionario {
    int cracha;
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

    void cacularAumento(Funcionario f2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

