/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06ex02;

/**
 *
 * @author Daniel Silva
 */
public class Programador extends Empregado{
    private float qtdHoras;
    private float valorHora;
    
    public Programador() {}
    
    public Programador(String nome, String matricula, float qtdHoras, float valorHora) {
        super(nome, matricula); 
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }
    
    @Override
    public float calculaSalario() {
        return this.valorHora * this.qtdHoras;
    }
}
