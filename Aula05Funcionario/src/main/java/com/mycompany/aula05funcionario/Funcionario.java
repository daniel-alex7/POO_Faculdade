/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05funcionario;

/**
 *
 * @author Daniel Silva
 */
class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;
    
    public Funcionario() {
        this.cargo = "assistente";
    }
    
     public Funcionario(int c, float s, String car) {
        this.cracha = c;
        this.salario = s;
        this.cargo = car;
    }
     
    public void calculaAumento(float porcentagem) {
        this.salario = this.salario + (this.salario * (porcentagem / 100));
    }
    
     public void calculaAumento(int tempo) {
        this.salario = this.salario + (tempo * 150.00f);
    }
     
    public float getSalario() {
        return salario;
    }
    
    public String getCargo() {
        return cargo;
    }
}
