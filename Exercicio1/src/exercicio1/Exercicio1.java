package exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {

        Triangulo triangulo1 = new Triangulo(2.0f, 3.0f);

        float area_total = 100 * triangulo1.calculaTriangulo();
        triangulo1.ImprimirValor();
        
        System.out.println("Area Total: "+ area_total);
        
        
        Data dt01 = new Data();
        
        
        dt01.cadastarDados();
        dt01.ImprimirDados();
         
    }
}