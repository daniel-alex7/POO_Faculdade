/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06ex02;

/**
 *
 * @author Daniel Silva
 */
public class Analista extends Empregado{
    private float[] valorPorProjeto; 
    
    public Analista() {}
    
    public Analista(String nome, String matricula, float[] valorPorProjeto) {
        super(nome, matricula);
        this.valorPorProjeto = valorPorProjeto;
    }
    
    @Override
    public float calculaSalario() {
        float total = 0;
        if (valorPorProjeto != null) {
            for (float valor : valorPorProjeto) {
                total += valor;
            }
        }
        return total;
    }
} 
