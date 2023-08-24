/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
   private String modelo;
   private String marca;
   private CorEnum cor;
   private int ano;
   private int rodas;
   private boolean ligado;
   private Marcha marcha;
   private int qtdeRodas;
   private boolean estaEmRE;

    public Carro(String modelo, CorEnum cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public Carro(String modelo, String marca, CorEnum cor, int ano, int rodas, Marcha marcha, int qtdeRodas,boolean ligado) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.rodas = rodas;
        this.marcha = marcha;
        this.qtdeRodas = qtdeRodas;
        this.ligado = ligado;
    }
    public void trocarMarcha(Marcha novaMarcha){
        if (ligado) {
            if (podeTrocarMarcha (novaMarcha)) {
                marcha = novaMarcha;
                System.out.println("Marcha troca para" + marcha);
            } else{
                System.out.println("Nao é recomendado trocar da "+ marcha + "para a" + novaMarcha.getMarcha());
            }
        }else{
            System.out.println("O carro precisa estar ligado para trocar a marcha"); 
                    }
    }
        private boolean podeTrocarMarcha(Marcha novaMarcha){
            int indiceMarchaAtual = marcha.getNumeroMarcha();
            int indiceNovaMarcha = novaMarcha.getNumeroMarcha();
            
            return Math.abs(indiceNovaMarcha - indiceMarchaAtual) == 1;
        }

    public Marcha getMarcha() {
        return marcha;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", rodas=" + rodas + ", ligado=" + ligado + ", marcha=" + marcha + ", qtdeRodas=" + qtdeRodas + ", estaEmRE=" + estaEmRE + '}';
    }
        

        
   
   }
   
