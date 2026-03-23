/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula04;

import java.util.Scanner;

public class Aula04 {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(12232, 2000, "Analista JR");
        
        Funcionario f2 = new Funcionario(1234, 5000, "Analista PN");
        
        System.out.println(f1.cargo);
        System.out.println(f2.cargo);
        
        System.out.println(f1.calcularAumento(0.1));
        System.out.println(f1.calcularAumento(3));
        
       
        

        
    };
}
