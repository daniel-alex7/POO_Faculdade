package unicsul.poo.atividade02.java;

import javax.swing.JOptionPane;

public class Caixa extends Funcionario{
    private double valorHora;
    private double horasTrabalhadas;

    public Caixa() {
    }

    public Caixa(String nome, String matricula, double valorHora, double horasTrabalhadas) {
        super(nome, matricula);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public void acrescentaHoras(double h){
        horasTrabalhadas += h;
    }
    
    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }

    public void imprimir() {
        String mensagem = String.format("""
                                        Nome: %s
                                        Matricula: %s
                                        Valor Hora: %.1f
                                        Horas Trabalhadas: %.1f
                                        Pagamento: %.1f
                                        """, 
                nome, matricula, valorHora, horasTrabalhadas, calcularPagamento());
        JOptionPane.showMessageDialog(null, mensagem, "Informações Caixa", JOptionPane.INFORMATION_MESSAGE);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
