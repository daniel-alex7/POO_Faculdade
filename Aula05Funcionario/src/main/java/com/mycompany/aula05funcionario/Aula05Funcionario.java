/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula05funcionario;

/**
 *
 * @author Daniel Silva
 */
public class Aula05Funcionario {

    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        System.out.println("Cargo f1: " + f1.getCargo()); 

        
        Funcionario f2 = new Funcionario(123, 2000.0f, "Analista");
        
        
        f2.calculaAumento(10.0f);
        System.out.println("Salário f2 após 10%: R$ " + f2.getSalario());

        
        f2.calculaAumento(2);
        System.out.println("Salário f2 após tempo: R$ " + f2.getSalario());
    }
}
