
package Atividade01;

import java.util.Scanner;


public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a distancia:");
        int distancia = scanner.nextInt();
        
        if (distancia <= 200) {
            double valor1 = distancia * 0.5;
            System.out.println("Valor da viagem: " + valor1);
        } else {
            double valor2 = distancia * 0.45;
            System.out.println("Valor da viagem: " + valor2);
        }
        scanner.close();
    }
}
