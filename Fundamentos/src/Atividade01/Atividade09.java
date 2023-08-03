
package Atividade01;

import java.util.Scanner;


public class Atividade09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de notas: ");
        int qtdadeNotas = scanner.nextInt();
        
        double soma = 0;
        
        for (int i = 1; i <= qtdadeNotas; i++) {
            System.out.println("Digite a nota" + i + ":");
            double resultado  = scanner.nextDouble();
            soma += resultado;
        }
       double media = soma /qtdadeNotas;
        System.out.println("Media" + media);
        
        scanner.close();
    }
   
}
