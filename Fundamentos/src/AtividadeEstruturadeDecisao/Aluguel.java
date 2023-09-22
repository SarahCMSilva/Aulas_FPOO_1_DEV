/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadeEstruturadeDecisao;

/**
 *
 * @author Aluno
 */
public class Aluguel {
    private String carro;
    private int qtdeDias;
    private int KmRodado;
    private double ValorDia;
    private double ValorKm;
    private double Diferenca;
    
    public Aluguel() {
    }
    
    public Aluguel(int qtdeDias, int KmRodado, String carro) {
        this.qtdeDias = qtdeDias;
        this.KmRodado = KmRodado;
        this.carro = carro;
    }

    public String getCarro() {
        return carro;
    }
    
    public int getQtdeDias() {
        return qtdeDias;
    }

    public int getKmRodado() {
        return KmRodado;
    }

    public double getValorDia() {
        return ValorDia;
    }

    public double getValorKm() {
        return ValorKm;
    }

    public double getDiferenca() {
        return Diferenca;
    }
    
    public void Calcular() {
        
        if (this.qtdeDias <= 5) {
            this.ValorDia = this.qtdeDias * 135.00;
        } else  if (this.qtdeDias > 5 && this.qtdeDias <= 10){
            this.ValorDia = this.qtdeDias * 105.00;
        }else  if (this.qtdeDias > 10 && this.qtdeDias <= 15){
            this.ValorDia = this.qtdeDias * 95.00;
        }else  if (this.qtdeDias > 15){
            this.ValorDia = this.qtdeDias * 80.00;
        }else {
            System.out.println("Nao foi possivel calcular");
        }
        
        if (this.KmRodado > 100 && this.KmRodado <= 1000) {
            this.ValorKm = this.KmRodado * 8.99;
        } else  if (this.KmRodado > 1000 && this.KmRodado <= 2500){
            this.ValorKm = this.KmRodado * 7.99;
        }else  if (this.KmRodado > 2501 && this.KmRodado <= 4000){
            this.ValorKm = this.KmRodado * 6.99;
        }else  if (this.KmRodado > 4000){
            this.ValorKm = this.KmRodado * 5.99;
        }else {
            System.out.println("Nao foi possivel calcular");
        }
        
        this.Diferenca = this.KmRodado - this.ValorDia;
        
        if (this.KmRodado > this.ValorDia) {
            System.out.println("A promocao em quilometragem tera mais desconto: " + this.Diferenca);
        }else if(this.ValorDia > this.KmRodado){
            
        System.out.println("A promocao por dia tera mais desconto: " + this.Diferenca);
        }
    }

    @Override
    public String toString() {
        return "Aluguel{" + "carro=" + carro + ", qtdeDias=" + qtdeDias + ", KmRodado=" + KmRodado + ", ValorDia=" + ValorDia + ", ValorKm=" + ValorKm + ", Diferenca=" + Diferenca + '}';
    }


    

    
}
