package aula3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Silva
 */
import java.util.Scanner;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    // Construtor padrão
    public Data() {
    }

    // Construtor com parâmetros
    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public void cadastraDados() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        this.dia = sc.nextInt();
        System.out.print("Digite o mês: ");
        this.mes = sc.nextInt();
        System.out.print("Digite o ano: ");
        this.ano = sc.nextInt();
    }

    public void imprimeData() {
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    }
}