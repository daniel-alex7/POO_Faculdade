/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula05torneio;

/**
 *
 * @author Daniel Silva
 */
public class Aula05Torneio {

   
    public static void main(String[] args) {
        
        Torneio atleta1 = new Torneio("Daniel Silva", 12);
        atleta1.imprimirDados();

        
        Torneio atleta2 = new Torneio("Maria Oliveira", 35);
        atleta2.imprimirDados();
        
        
        atleta1.setIdade(17);
        System.out.println("\n--- Após atualização de idade ---");
        atleta1.imprimirDados();
    }
}
