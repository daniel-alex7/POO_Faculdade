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
        
        System.out.println("Digite o mes: ");
        mes = scan.nextInt();
        
        System.out.println("Digite o ano: ");
        ano = scan.nextInt();
    }
        
    void ImprimirDados(){
        System.out.println("A data: " + dia +"/"+ mes +"/"+ ano);
    }
   
    }
    

