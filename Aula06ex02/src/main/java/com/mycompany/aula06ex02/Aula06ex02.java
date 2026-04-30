/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula06ex02;

import java.util.Scanner;

/**
 *
 * @author Daniel Silva
 */
public class Aula06ex02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Dados do Programador
        System.out.println("--- Cadastro de Programador ---");
        System.out.print("Nome: ");
        String nomeP = teclado.nextLine();
        System.out.print("Matrícula: ");
        String matP = teclado.nextLine();
        System.out.print("Valor da Hora: ");
        float vh = teclado.nextFloat();
        System.out.print("Qtd Horas: ");
        float qh = teclado.nextFloat();
        teclado.nextLine(); // Limpar buffer

        Programador p = new Programador(nomeP, matP, qh, vh);

        // Dados do Analista
        System.out.println("\n--- Cadastro de Analista ---");
        System.out.print("Nome: ");
        String nomeA = teclado.nextLine();
        System.out.print("Matrícula: ");
        String matA = teclado.nextLine();
        System.out.print("Quantos projetos? ");
        int nProjetos = teclado.nextInt();
        float[] projetos = new float[nProjetos];
        
        for(int i = 0; i < nProjetos; i++) {
            System.out.print("Valor do projeto " + (i+1) + ": ");
            projetos[i] = teclado.nextFloat();
        }

        Analista a = new Analista(nomeA, matA, projetos);

        // Resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.printf("Programador: %s (%s) | Salário: R$ %.2f\n", p.nome, p.matricula, p.calculaSalario());
        System.out.printf("Analista: %s (%s) | Salário: R$ %.2f\n", a.nome, a.matricula, a.calculaSalario());
}
}