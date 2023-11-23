/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class classes {

    public static void main(String[] args) {

        //Cria uma data com dia atual
        LocalDate hoje = LocalDate.now();
        //Cria uma data com dia e hora atual
        LocalDateTime agora = LocalDateTime.now();
        //Cria uma data especificado ano, mes,dia
        LocalDate diaNatalAnoAnterior = LocalDate.of(2022, 12, 25);
        //Cria uma data especificado ano, mes,dia, hora e minuto.
        LocalDateTime horarioNatalAnterior = LocalDateTime.of(2022, 12, 25, 22, 20);

        //Adicionar ou retirar os dias:
        LocalDate dataFutura = hoje.plusDays(10);
        LocalDate dataPassada = hoje.plusDays(50);
        
        //Comparar datas    
        int comparaDatas = hoje.compareTo(dataFutura);
        System.out.println(comparaDatas);
        
        //formata a data para o padrao Br
        //Cria um padrao usando a classe DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatadaPadraoPtBr = hoje.format(formatter);
        System.out.println("Data Formata: " + dataFormatadaPadraoPtBr);
        
        //Converter string para data
        String diaAnoNovo = "01/01/2014";
        LocalDate dataAltoNivel = LocalDate.parse(diaAnoNovo,formatter);
        System.out.println("Data alto nivel: "+ dataAltoNivel);
                
        
        
    }
}
