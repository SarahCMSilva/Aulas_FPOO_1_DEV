
package Atividade02;

import java.util.Scanner;


public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a largura:");
        double largura = scanner.nextDouble();
        
        System.out.println("Digite o comprimento:");
        double comprimento = scanner.nextDouble();
        
        double area = largura * comprimento;
        
        if (area <= 250) {
            double valor = area * 8.50;
            System.out.println("O valor total é: " + valor);
        } else if (area <= 350) {
            double valor = area * 9.50;
            System.out.println("O valor total é: " + valor);
        }else if (area >= 350) {
            double valor = area * 11.50;
            System.out.println("O valor total é: " + valor);
        }
    }
}
