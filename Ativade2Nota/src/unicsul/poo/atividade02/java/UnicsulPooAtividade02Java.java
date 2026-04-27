package unicsul.poo.atividade02.java;

import java.util.Scanner;

public class UnicsulPooAtividade02Java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Caixa caixa01 = new Caixa("caixa01", "4002-8922", 7.37, 44);
        Vendedor vendedor01 = new Vendedor("vendedor01", "1234-5678", 3500, 600);
        
        vendedor01.setVendas(4000);
        System.out.println("Comissão de " + vendedor01.getNome() + ": " + vendedor01.calcularComissao());
        
        System.out.println("Pagamento de "  + vendedor01.getNome() + ": " + vendedor01.calcularPagamento());
        
        System.out.println("Informe a quantidade de horas para acrescentar ao caixa01: ");
        caixa01.acrescentaHoras(scanner.nextDouble());
        
        caixa01.imprimir();
        
    }
    
}
