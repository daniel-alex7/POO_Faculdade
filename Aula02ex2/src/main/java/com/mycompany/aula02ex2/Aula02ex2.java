/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula02ex2;

import java.util.Scanner;

/**
 *
 * @author Daniel Silva
 */
public class Aula02ex2 {

    public static void main(String[] args) {
    
       
       Scanner scan = new Scanner(System.in);
     
       
       System.out.println("Digite o nome: ");
       String n = scan.nextLine();
       
       System.out.println("Digite o RG: ");
       String r = scan.nextLine();
       
       System.out.println("Digite o endereco: ");
       String e = scan.nextLine();
       
       System.out.println("Digite o telefone: ");
       String t = scan.nextLine();
       
       System.out.println("Digite a data de nascimento: ");
       String na = scan.nextLine();
       
       System.out.println("Digite a profissão: ");
       String p = scan.nextLine();

       Paciente paciente1 = new Paciente(n, r, e, t, na, p);
       
       paciente1.imprimeDados();
    }
}
