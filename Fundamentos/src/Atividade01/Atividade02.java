
package Atividade01;

import java.util.Scanner;


public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        
        System.out.println("Digite a quantidade do produto: ");
        int qtdeProduto = scanner.nextInt();
        
        System.out.println("Digite D para pagamento em debito e C para credito:");
        String formaPagamento = scanner.next();
        
        double valorTotal = (valorProduto * qtdeProduto);
        
        if ( formaPagamento == "D" && valorTotal <= 100) {
             double valor = ((valorTotal * 0.03) - valorTotal);
             System.out.println("Total da compra: " + valor);
        } else {
             double valor2 = ((valorTotal * 0.05) - valorTotal);
             System.out.println("Total da compra: " + valor2);
        }
        if (formaPagamento == "C") {
            System.out.println("Total da compra: " + valorTotal);
            
        }
        //parcelar em quantas vezes
    }
    
}
