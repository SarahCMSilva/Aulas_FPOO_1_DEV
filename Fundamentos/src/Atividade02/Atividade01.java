
package Atividade02;

import java.util.Scanner;


public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva seu cargo:");
        String cargo = scanner.next();
        
        if (cargo.equalsIgnoreCase("Gerente")) {
            double salario = 5590.00;
            double convenio = 289.00;
            double inss = (salario * 0.08);
            double desconto = salario - (inss + convenio);
            
            System.out.println("Seu salario é: " + desconto);
        } else if (cargo.equalsIgnoreCase("Supervisor")) {
            double salario =  4128.00;
            double convenio = 239.00;
            double inss = (salario * 0.07);
            double desconto = salario - (inss + convenio);
            
            System.out.println("Seu salario é: " + desconto);
        } else if (cargo.equalsIgnoreCase("Tecnico")) {
            double salario = 3789.00;
            double convenio = 189.00;
            double inss = (salario * 0.04);
            double desconto = salario - (inss + convenio);
            
            System.out.println("Seu salario é: " + desconto);
        }else if (cargo.equalsIgnoreCase("Auxiliar")) {
            double salario = 2345.00 ;
            double convenio = 156.00;
            double inss = (salario * 0.02);
            double desconto = salario - (inss + convenio);
            
            System.out.println("Seu salario é: " + desconto);
        }else{
            System.out.println("Nao foi possivel adquirir os dados");
        }
        
    }
}
