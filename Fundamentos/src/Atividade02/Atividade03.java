
package Atividade02;

import java.util.Scanner;


public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de pessoas:");
        int qtdapessoas = scanner.nextInt();
        
        System.out.println("Digite o numero da opcao do prato:");
        int prato = scanner.nextInt();
        
        double opcao1 = 19.99;
        double opcao2 = 18.99;
        double opcao3 = 23.99;
        
        switch (prato) {
            case 1:
                double ValorTotal = opcao1 * qtdapessoas;
                System.out.println("Valor total: " + ValorTotal);
                break;
            case 2:
                double ValorTotal2 = opcao2 * qtdapessoas;
                System.out.println("Valor total: " + ValorTotal2);
                break;
            case 3:
                double ValorTotal3 = opcao3 * qtdapessoas;
                System.out.println("Valor total: " + ValorTotal3);
                break;
            default:
                System.out.println("Nao foi possivel realizar a conta");
        }
    }
}
