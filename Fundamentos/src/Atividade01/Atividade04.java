
package Atividade01;

import java.util.Scanner;


public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual seu salario: ");
        double salario = scanner.nextDouble();
        
        if (salario >= 1350) {
            double aumento = (salario * 0.10) + salario;
            System.out.println("Seu salario atual é: " + aumento);
        } else {
            double aumento2 = (salario * 0.15) + salario;
            System.out.println("Seu salario atual é: " + aumento2);
        }
        scanner.close();
    }
}
