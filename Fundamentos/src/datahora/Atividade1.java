/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datahora;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
public class Atividade1 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        int dia = hoje.getDayOfMonth();
        int mes = hoje.getMonthValue();
        int ano = hoje.getYear();
       
        String frase = "Hoje e dia  " + dia + " do mes " + mes + " do ano de " + ano;
        System.out.println(frase);
        
        Locale localeBrasil = Locale.of("pt","BR");
        
        String mesPorExtenso = hoje.getMonth().getDisplayName(TextStyle.FULL, localeBrasil);
        String dataPorExtenso = String.format("Hoj e dia %d do mes %s,ano %d", dia,mesPorExtenso,ano);
        System.out.println(dataPorExtenso);
    }
}
