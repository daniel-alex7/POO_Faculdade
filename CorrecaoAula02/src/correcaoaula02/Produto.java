package correcaoaula02;


public class Produto {
    //Atributos
        String marca;
        String fabricante;
        String cod_barras;
        float preco;
        
        
        //métodos construtores
        public Produto(){}
        
        public Produto(String marca, String fabricante, String cod_barras, float preco){
            this.marca = marca;
            this.fabricante = fabricante;
            this.cod_barras = cod_barras;
            this.preco = preco;
        }     
        
        //Métodos da classe
        
        void imprimeDados(){
            System.out.println("Dados cadastrados");
            System.out.println("Marca: " + marca);
            System.out.println("Fabricante: " + fabricante);
            System.out.println("Código de barras: " + cod_barras);
            System.out.println("Preco: " + preco);
        }
        
        float calculaImposto(float p){
            float imp = 0.1f;
            float imposto = preco * imp;
            return imposto;
        }
  
}
        

