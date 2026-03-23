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

}


          
    
    
    


