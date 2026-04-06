
package aula06;
import java.util.Scanner;

public class Aula06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada da circunferência
        System.out.print("Digite o raio da circunferência: ");
        float raio = sc.nextFloat();
        Circunferencia c = new Circunferencia(raio);

        // Entrada do retângulo
        System.out.print("Digite a base do retângulo: ");
        float base = sc.nextFloat();

        System.out.print("Digite a altura do retângulo: ");
        float altura = sc.nextFloat();
        Retangulo r = new Retangulo(base, altura);

        // Saída
        System.out.println("\n--- Circunferência ---");
        c.mostra();

        System.out.println("\n--- Retângulo ---");
        r.mostra();

        sc.close();
    }
    
}
