
package correcaoaula02;
import java.util.Scanner;

public class CorrecaoAula02 {

   public static void main(String[] args){
       
       Scanner scan = new Scanner(System.in);
    
//       Produto produto1 = new Produto();
//       
//       System.out.println("Digite a marca: ");
//       produto1.marca = scan.nextLine();
//       
//       
//       System.out.println("Digite o fabricante: ");
//       produto1.fabricante = scan.nextLine();
//       
//       System.out.println("Digite o codigo de barras: ");
//       produto1.cod_barras = scan.nextLine();
//       
//       System.out.println("Digite o preco: ");
//       produto1.preco = scan.nextFloat();
       
       
//       System.out.println("---------Porduto Cadastrado----------");
//       System.out.println(produto1.marca);
//       System.out.println(produto1.fabricante);
//       System.out.println(produto1.cod_barras);
//       System.out.println(produto1.preco);
//       
       
//       produto1.imprimeDados();
       
       System.out.println("Digite a marca: ");
       String m = scan.nextLine();
       
       System.out.println("Digite o fabricante: ");
       String f = scan.nextLine();
       
       System.out.println("Digite o codigo: ");
       String c = scan.nextLine();
       
       System.out.println("Digite o preco: ");
       Float p = scan.nextFloat();

       Produto produto2 = new Produto(m, f, c, p);
       
       produto2.imprimeDados();
       
       System.out.print("Qual a taxa de imposto? ");
       float imp = scan.nextFloat();
       
       System.out.print("Imposto:  " + produto2.calculaImposto(imp));
       
//       System.out.println("---------Porduto2 Cadastrado----------");
//       System.out.println(m);
//       System.out.println(f);
//       System.out.println(c);
//       System.out.println(p);


  
   }     
    }   



