
package Atividade01;

import java.util.Scanner;


public class Atividade06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual  o valor da casa: ");
        double ValorCasa = scanner.nextDouble();
        
        System.out.println("Qual  o seu salario: ");
        double salario = scanner.nextDouble();
        
        System.out.println("Em quantos anos gostaria de pagar: ");
        int AnosPagar = scanner.nextInt();
        
        double LimitePagamento = (salario * 3) / 100;
        double ValorMes = ((AnosPagar * 12) / ValorCasa);
        
        if (ValorMes < LimitePagamento) {
            System.out.println("Nao foi possivel realizar o emprestimo");
        } else {
            System.out.println("Emprestimo realizado" );
        }
    }
}
