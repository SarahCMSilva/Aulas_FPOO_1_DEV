/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos.atividade05;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Aluno
 */
public class RedeSocial {
    public static void main(String[] args) throws UnsupportedEncodingException { System.setOut(new PrintStream(System.out, true,"UTF-8"));
        Post post1 = new Post("Rodrigo", "Gatos","Gatos fofos", 3);
        System.out.println(post1);
        post1.validarUsuario(post1.getUsuario());
        post1.verificarTitulo(post1.getTitulo());
        post1.verificardescricao(post1.getDescricao());
        post1.estrelasAvaliaçao(post1.getClassificacaoPost());
        
        System.out.println("--------------------------------------");
        Post post2 = new Post("li", "wwwwwwwwwwwwwwwwwww","", 0);
        System.out.println(post2);
        post2.validarUsuario(post2.getUsuario());
        post2.verificarTitulo(post2.getTitulo());
        post2.verificardescricao(post2.getDescricao());
        post2.estrelasAvaliaçao(post2.getClassificacaoPost());
        
        System.out.println("--------------------------------------");
        Post post3 = new Post("juliano", "Teste de programaçao","PRogramação java", 5);
        System.out.println(post3);
        post3.validarUsuario(post3.getUsuario());
        post3.verificarTitulo(post3.getTitulo());
        post3.verificardescricao(post3.getDescricao());
        post3.estrelasAvaliaçao(post3.getClassificacaoPost());
    }
}
