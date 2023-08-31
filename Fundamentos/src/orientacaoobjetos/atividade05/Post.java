/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos.atividade05;

/**
 *
 * @author Aluno
 */
public class Post implements ClassificacaoPost{
    private String usuario;
    private String titulo;
    private String descricao;
    private int ClassificacaoPost;

    public Post(String usuario, String titulo, String descricao, int ClassificacaoPost) {
        this.usuario = usuario;
        this.titulo = titulo;
        this.descricao = descricao;
        this.ClassificacaoPost = ClassificacaoPost;
    }

   

    public Post(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getClassificacaoPost() {
        return ClassificacaoPost;
    }
    
    @Override
    public boolean estrelasAvaliaçao(int ClassssificacaoPost) {
        if (ClassssificacaoPost == ESTRELAS_COMUM) {
            System.out.println("Seu post está aceitavel");
            return true;
        }
        if (ClassssificacaoPost == ESTRELAS_LEGAL) {
            System.out.println("Seu post está muito legal" + ESTRELAS_COMUM);
            return true;
        }
        if (ClassssificacaoPost == ESTRELAS_SUPER) {
            System.out.println("Seu post está super legal");
            return true;
        }else {
            System.out.println("Avaliação invalida");
            return false;
        }
    }
        
    @Override
    public boolean validarUsuario(String usuario) {
        if (usuario.length() > 2) {
            System.out.println("Nome de usuario: " + usuario + " do cliente é valido");
            return true;
        } else {
            System.out.println("Nome de usuario: " + usuario + " do cliente é invalido");
            return false;
        }
    }

    @Override
    public boolean verificarTitulo(String titulo) {
        if (titulo.length() > 20) {
            
            System.out.println("Titulo: " + titulo + " exedeu o limite de caracteres");
            return false;
        } else {
            System.out.println("Titulo: " + titulo );
            return true;
        }
    }
    @Override
    public boolean verificardescricao(String titulo) {
        if (descricao.length() > 400) {
            
            System.out.println("Descrição: " + descricao + " exedeu o limite de caracteres");
            return true;
        }
        if (descricao.length() < 2) {
            
            System.out.println("Descrição: numero de caracteres invalido");
            return false;
        }else {
            System.out.println("descrição: " + descricao );
            return true;
        }
    }

    @Override
    public String toString() {
            if (this.usuario == null) {
            return "Post{" + "usuario=" + usuario +  '}';
        } else {
        return "Post{" + "usuario=" + usuario + ", titulo=" + titulo + ", descricao=" + descricao + ", ClassificacaoPost=" + ClassificacaoPost + '}';
    }
    
   
        
    }
    

    
    
}
