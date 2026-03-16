package exercicio1;

public class Triangulo {

    float base;
    float altura;

    // Construtor
    
    
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular a área
    float calculaTriangulo() {
        return (base * altura) / 2;
    }
    
    void ImprimirValor(){
        System.out.println("A area do triangulo é: " + calculaTriangulo());
    }
}