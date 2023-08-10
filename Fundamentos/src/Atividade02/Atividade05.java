
package Atividade02;

import java.util.Scanner;


public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o numero do carro(carro1:Fiat Argo),(carro2:Fiat Mobi),(carro3:Hyundai Hb20):");
        int carro = scanner.nextInt();
        
        System.out.println("distancia:");
        double distancia = scanner.nextDouble();
        
        System.out.println("dias:");
        int dias = scanner.nextInt();
        
        switch (carro) {
            case 1:
                double valor1 = (98.00 * dias) + (distancia * 2.39);
                System.out.println("O valor total é " + valor1);
                break;
            case 2:
                double valor2 = ( 79.00  * dias) + (distancia * 1.99);
                System.out.println("O valor total é " + valor2);
                break;
            case 3:
                double valor3 = (102.00  * dias) + (distancia * 2.99);
                System.out.println("O valor total é " + valor3);
                break;
            default:
                System.out.println("Nao foi possivel realizar a conta");
        }
        
        
        
    }
}
