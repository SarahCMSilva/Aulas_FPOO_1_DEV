
package Atividade01;

import java.util.Scanner;


public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a velocidade do carro em km/h: ");
        int velocidade = scanner.nextInt();
        
        if (velocidade >= 80) {
            double multa = ((velocidade - 80) * 5);
            System.out.println("Voce foi multado: "+ multa);
        } else {
            System.out.println("Voce esta dentro do limite");
        }
        scanner.close();
    }
}
