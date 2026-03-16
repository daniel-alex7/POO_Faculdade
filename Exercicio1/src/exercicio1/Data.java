package exercicio1;

import java.util.Scanner;

public class Data {
    int dia;
    int mes;
    int ano;
    
    Data(){}
    
    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;  
    }
    
    void cadastarDados(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o dia: ");
        dia = scan.nextInt();
        
        System.out.println("Digite o dia: ");
        mes = scan.nextInt();
        
        System.out.println("Digite o dia: ");
        ano = scan.nextInt();
    }
        
    void ImprimirValor(){
        System.out.println("A data de hoje é: " + dia +"   mes: "+ mes +"   ano: "+ ano);
    }
   
    }
    

