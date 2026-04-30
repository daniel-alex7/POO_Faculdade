public class Principal {
    public static void main(String[] args) {
        
        ContaConsumo contaLuz = new ContaConsumo("Energia Elétrica", 200.00);
        
        
        ContaConsumo contaInternet = new ContaConsumo();
        contaInternet.tipoServico = "Internet Fibra";
        contaInternet.valorFatura = 150.00;

        
        System.out.println("--- Teste Conta 1 (Parcelado) ---");
        contaLuz.imprimeDados();
        contaLuz.pagarConta(5); 

        System.out.println("\n--- Teste Conta 2 (À Vista) ---");
        contaInternet.imprimeDados();
        contaInternet.pagarConta();

        System.out.println("\n--- Teste de Erro (Parcelas Inválidas) ---");
        contaLuz.pagarConta(15); 
    }
}