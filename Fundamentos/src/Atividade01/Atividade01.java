
package Atividade01;

import java.util.Scanner;


public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o raio do circulo");
        double raio = scanner.nextDouble();
        
        scanner.close();
        
        double area = 3.14*(raio*raio);
                System.out.println("resultado: " + area);
    }
}
