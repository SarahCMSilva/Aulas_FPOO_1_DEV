/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Aula02 {
    public static void main(String[] args) {
        String escola = "Senai Mario Henrique";
        
        System.out.println(escola.length());
        
        int idadeSenai = 41;
        
        String mensagem = String.format("A escola %s tem %d anos", escola, idadeSenai);
        
        System.out.println(mensagem);
        
        String primeiroCaractere =String.valueOf( escola.charAt(0));
        char primeiroCaractere1 = escola.charAt(0);
        System.out.println(primeiroCaractere);
        
        String[] partes = escola.split(" ");
        System.out.println(partes[0]);
        
        String cidade = "piracicaba";
        System.out.println(cidade.toUpperCase());
        
        
        String comida = "SORVETE";
        System.out.println(comida.toLowerCase());
        
        String cidadeAlterado =cidade.replace("a", "z");
        System.out.println(cidadeAlterado);
        
        String palavra = "atenciosamente";
        String palavraAlterado =palavra.replaceFirst("a", "z");
        System.out.println(palavraAlterado);
        
        String texto= "Ola,seja bem vindo ao Senai";
        boolean contemSenai = texto.contains("Senai");
        System.out.println(contemSenai);
        
        String frase = "sou desenvolvedor de sistemas";
        boolean fraseSenai = frase.startsWith("Senai");
        boolean fraseSistemas = frase.endsWith("sistemas");
        System.out.println(fraseSenai);
        System.out.println(fraseSistemas);
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = input.next();
        
        System.out.print("Digite seu email: ");
        String email = input.next();
        
        String nomeAlterado =nome.substring(0,3);
        String emailAlterado =nome.substring(0,5);
        String junto = nomeAlterado + emailAlterado;
        
        System.out.println(junto);
        Random random = new Random();
        String senha =" ";
        for (int i = 0; i < junto.length(); i++) {
            
            int posicao = random.nextInt(junto.length());
            String senhaSorteada = String.valueOf(junto.charAt(posicao));
            
            senha += senhaSorteada;
            
        }
         System.out.println("Sua senha e: " + senha);
        input.close();
    
    }
}
