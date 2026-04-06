
package aula06;

public class Circunferencia extends Forma {
    private float raio;
    
    
    public Circunferencia (float raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

   
    @Override
    public float area () {
        return (float) 3.14*(raio*raio);
    }
    
    @Override
    public float perimetro (){
      return (float) (2 * 3.14 * raio);
    } 
    
    @Override
    public void mostra (){
        System.out.println("Raio: " + raio );
        System.out.println("Area: " + this.area() );
        System.out.println("Perimetro: " + this.perimetro());
    }
}
