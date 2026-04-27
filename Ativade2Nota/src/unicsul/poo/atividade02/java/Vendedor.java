package unicsul.poo.atividade02.java;

public class Vendedor extends Funcionario{
    private double vendas;
    private double salario;

    public Vendedor() {
    }

    public Vendedor(String nome, String matricula, double vendas, double salario) {
        super(nome, matricula);
        this.vendas = vendas;
        this.salario = salario;
    }
    
    public double calcularComissao(){
        if(vendas >= 2000 && vendas < 4000){
            return vendas*0.1;
        } else if (vendas >= 4000 && vendas < 8000) {
            return vendas*0.15;
        } else if (vendas >= 8000) {
            return vendas*0.20;
        }
        return 0;
    }

    @Override
    public double calcularPagamento() {
        return salario+calcularComissao();
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
