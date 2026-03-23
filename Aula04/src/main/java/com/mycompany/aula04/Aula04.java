/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula04;

public class Aula04 {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(12232, 2000, "Analista JR");
        
        Funcionario f2 = new Funcionario(1234, 5000, "Analista PN");
        
        System.out.println(f1.getCargo());
        //System.out.println(f2.getCargo());
        
        System.out.println("Aumento: " + f1.calcularAumento(0.1f));
        System.out.println("Aumento por tempo: " +f1.calcularAumento(3));
        
        
        f2.setSalario(7000f);
        
        //
        System.out.println("Funcionario 1:  " + f1.calcularAumento(f1.salario));
        System.out.println("Funcionario 2:  " + f1.calcularAumento(f2.salario));
       
        
        Funcionario f3 = f1.duplicar();

       
    };
}
