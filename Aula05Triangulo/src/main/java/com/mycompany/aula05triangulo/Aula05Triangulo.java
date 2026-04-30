/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula05triangulo;

import java.util.Scanner;

/**
 *
 * @author Daniel Silva
 */
public class Aula05Triangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        
        System.out.println("--- Triângulo 1 (Construtor com parâmetros) ---");
        Triangulo t1 = new Triangulo(10.5, 5.0);
        t1.imprimeDados();

        
        System.out.println("--- Triângulo 2 (Construtor padrão) ---");
        Triangulo t2 = new Triangulo();

       
        System.out.print("Digite o valor da base: ");
        double b = leitor.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double a = leitor.nextDouble();

        
        t2.setBase(b);
        t2.setAltura(a);

        
        t2.imprimeDados();
    }
}
