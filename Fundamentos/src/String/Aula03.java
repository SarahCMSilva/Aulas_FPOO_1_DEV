/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author Aluno
 */
public class Aula03 {
    public static void main(String[] args) {
        String endereco = "Rua Fracisco Fernandes Sampaio";
        String bairro = "Santa Terezinha";
        String numero = "275";
                
        String mensagem = String.format("Meu endereco e %s, no bairro de %s, no numero da casa %s", endereco,bairro,numero);
        
        System.out.println(mensagem);
        
        char primeiroCaractere = endereco.charAt(0);
       
        
        String[] partes = endereco.split(" ");
        String iniciais = String.format("Inicias : %s %s %s ", partes[1].charAt(0),partes[2].charAt(0),partes[3].charAt(0),partes[3].charAt(0));
        System.out.println(iniciais);
//      
        
    }
}
