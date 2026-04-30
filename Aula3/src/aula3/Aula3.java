/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3;

public class Aula3 {

    public static void main(String[] args) {

        Triangulo t1 = new Triangulo(10.5f, 5.0f);
        Triangulo t2 = new Triangulo(20.0f, 15.0f);

        System.out.println(t1.imprimeDados());
        System.out.println(t2.imprimeDados());

        System.out.println("---------------------------");

        Data d1 = new Data(25, 4, 2026);
        Data d2 = new Data();

        System.out.println("Cadastro da segunda data:");
        d2.cadastraDados();

        d1.imprimeData();
        d2.imprimeData();
    }
}
