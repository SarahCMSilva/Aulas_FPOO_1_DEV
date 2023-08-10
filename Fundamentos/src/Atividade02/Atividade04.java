
package Atividade02;

import java.util.Scanner;


public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o numero do produto(produto1: Notebook Lenovo),(produto2: Celular MotoG22),(produto3:Carro Hb20),(produto4:Apartamento):");
        int carro = scanner.nextInt();
        
        switch (carro) {
            case 1:
                double valormes1 = (3299.00 * 0.05);
                double valortotal1 = 3299.00 / valormes1;
                System.out.println("Valor total a pagar:"+ valortotal1);
                break;
            case 2:
                double valormes2 = (1789.00 * 0.10);
                double valortotal2 = 1789.00 / valormes2;
                System.out.println("Valor total a pagar:"+ valortotal2);
                break;
            case 3:
                double valormes3 = (68000.00 * 0.02);
                double valortotal3 = 68000.00 / valormes3;
                System.out.println("Valor total a pagar:"+ valortotal3);
                break;
            case 4:
                double valormes4 = (180000.00 * 0.01);
                double valortotal4 = 180000.00 / valormes4 ;
                System.out.println("Valor total a pagar:"+ valortotal4);
                break;
            default:
                System.out.println("NAo foi possiverl realizar o calculo");
        }
    }
}
