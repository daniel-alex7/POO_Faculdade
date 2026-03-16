package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base do triângulo:");
        float base = scan.nextFloat();

        System.out.println("Digite a altura do triângulo:");
        float altura = scan.nextFloat();

        Triangulo triangulo1 = new Triangulo(base, altura);

        triangulo1.calculaTriangulo();
        triangulo1.ImprimirValor();

        
    }
}