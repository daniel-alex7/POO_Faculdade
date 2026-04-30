package aula3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Silva
 */
public class Triangulo {
    public float base;
    public float altura;

    // Construtor padrão
    public Triangulo() {
    }

    // Construtor com parâmetros
    public Triangulo(float b, float a) {
        this.base = b;
        this.altura = a;
    }

    public float calculaArea() {
        return (base * altura) / 2;
    }

    public String imprimeDados() {
        return "Triângulo [Base: " + base + ", Altura: " + altura + ", Área: " + calculaArea() + "]";
    }
}
