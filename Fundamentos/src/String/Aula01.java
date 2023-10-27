/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import javax.xml.transform.Source;

/**
 *
 * @author Aluno
 */
public class Aula01 {
    public static void main(String[] args) {
        
    
    /* 
    Criar uma variavel com o nome da cidade
    Atribuir o tamanho da string  a outra variavel
    Fazer o print da variavel e do tamanho 
    */
    
    String cidade ="Piracicaba";
    int tamanho = cidade.length();
    System.out.println("A cidade de " + cidade);
    System.out.println("Tem o tamanho de " + tamanho);
    
    //Minha cidade Piracicaba é muito linda;
    String frase  = "Minha cidade ".concat(cidade).concat("é muito linda :)");
    System.out.println(frase);
    
    //Imprimir o nome do aluno e sua media
   
    String aluno = new String("Valdemir");
    double media = 5.5;
    String fraseAluno = String.format("O aluno %s tem media %.2f", aluno,media);
        System.out.println(fraseAluno);
        
        //Declare uma string  com a idade de Piracicaba
        //Converta para inteiro
        //Faça o print da idade e da cidade com String format
    String idadePiracicaba = "256";
    int idadePiracicabaInt = Integer.parseInt(idadePiracicaba);
    String fraseIdade = String.format("A cidade de %s tem %d anos", cidade,idadePiracicabaInt);
        System.out.println(fraseIdade);
        
        //Declare uma variavel inteira com sua idade 
        //transforme em string essa variavel 
        //Utilize o string format para imprimir seu nome 
        //Com sua idade 
        
    int minhaIdade = 16;
    String stringIdade = String.valueOf(minhaIdade);
    String fraseIdade2 = String.format("A idade e %s",stringIdade);
        System.out.println(fraseIdade2);
    
    //Pesquise sobre o metodo split em java
    //Declare uma string com seu nome String as inicias do nome e sobrenome
    //Armazene em outra String as inicias do nome e sobrenome
    
    String nomeCompleto = "Sarah Christina";
    String inicias[] = nomeCompleto.split(" ");// Método separador
        System.out.println(inicias[0].charAt(0));
        System.out.println(inicias[1].charAt(0));
        
        
    //Metodo do Moises
    String nomeSobrenome ="Moises Olimpo";
    String[] vetor = nomeSobrenome.split(" ");
    String iniciais2 = String.format("Inicias do nome %s%s", vetor[0].charAt(0),vetor[1].charAt(0));
        System.out.println(iniciais2);
    
        //Utilize o nome da cidade e pegue
        //os 4 primeiros caracteres e os ultimo 4 tbm.
        
    String cidadeP4 =cidade.substring(0,4);
    String cidadeU4 = cidade.substring(cidade.length() -4);
    System.out.println("Primeiros quatro caracteres " + cidadeP4);
    System.out.println("Ultimos quatro caracteres " + cidadeU4);
    
    String texto = "Olá, Mundo!";
    String textoEmMaiusculas = texto.toUpperCase();
    String textoEmMinusculas = texto.toLowerCase();
    
        System.out.println(textoEmMaiusculas);
        System.out.println(textoEmMinusculas);
        
    String niver = 
            "Feliz ".toUpperCase()
                    .concat("aniversario, muitas ")
                    .concat("felicidades ".toUpperCase())
                    .concat("e muita ")
                    .concat("saude".toUpperCase());
        System.out.println(niver);
    }
}
