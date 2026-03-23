/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.torneioaula5;

/**
 * Torneio
- nome: string
- idade: int
Torneio(nome: string, idade: int)
getNome(): string
getIdade (): int
setNome(n: string): void
setIdade(i: int): void
verificaCategoria(): string
imprimeDados(): void

 */
public class TorneioAula5 {

    public static void main(String[] args) {
        Torneio pessoa1 = new Torneio("Daniel", 20);
        
        pessoa1.ImprimirDados();
    }
}
