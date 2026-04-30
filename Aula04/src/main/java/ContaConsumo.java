/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Silva
 */
public class ContaConsumo {
    
    public String tipoServico;
    public double valorFatura;
    public boolean estaPaga;

    
    public ContaConsumo() {
        this.estaPaga = false;
    }

    
    public ContaConsumo(String ts, double vf) {
        this.tipoServico = ts;
        this.valorFatura = vf;
        this.estaPaga = false;
    }

    
    public void imprimeDados() {
        System.out.println("Serviço: " + tipoServico);
        System.out.println("Valor da Fatura: R$ " + valorFatura);
        System.out.println("Status: " + (estaPaga ? "Paga" : "Pendente"));
    }

    
    public void pagarConta() {
        this.estaPaga = true;
        System.out.println("Conta de " + tipoServico + " paga à vista!");
    }

    
    public void pagarConta(int parcelas) {
       
        if (parcelas < 2 || parcelas > 12) {
            System.out.println("Quantidade de parcelas inválida para este serviço");
            return;
        }

        double juros = 0;

        if (parcelas <= 6) {
            juros = 0.10;
        } 
        else {
            juros = 0.15;
        }

        double valorTotalComJuros = valorFatura * (1 + juros);
        double valorDaParcela = valorTotalComJuros / parcelas;

        this.estaPaga = true;
        System.out.println("Pagamento parcelado em " + parcelas + "x:");
        System.out.printf("Valor de cada parcela: R$ %.2f\n", valorDaParcela);
        System.out.printf("Valor total com juros: R$ %.2f\n", valorTotalComJuros);
    }
}
