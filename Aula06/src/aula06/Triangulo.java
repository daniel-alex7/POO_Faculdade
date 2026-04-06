
package aula06;

public class Triangulo extends Forma {
    
    protected float base;
    protected float altura;
    
    public Triangulo(float base, float altura ){
        this.altura = altura;
        this.base = base;        
    }
    
    @Override
    public float area(){
        return (float) (base*altura)/2;
    }
    
    @Override
    public void mostra (){
        System.out.println("Area do Triângulo: " + this.area());
    }        
}
