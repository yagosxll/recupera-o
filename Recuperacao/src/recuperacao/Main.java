/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacao;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Endereco endereco = new Endereco("Travessa", "415", "Lado do Mercado", "4025865998", "Salvador", UnidadeFederativa.BAHIA);
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, 1515, "Iago", "4065865898", "51515151", endereco, Setor.MARKETING, Genero.MASCULINO, 6500, LocalDate.of(2000, Month.MARCH, 25));
        Motorista motorista = new Motorista("8485145811", "Iago", "403506589", "5156156156", endereco, Setor.MARKETING, Genero.MASCULINO, 4500, LocalDate.of(2000, Month.MARCH, 5));
        Advogado advogado = new Advogado("5151", "Ligia", "4035665898", "56151515", endereco, Setor.JURIDICO, Genero.FEMININO, 6500, LocalDate.of(1985, Month.MARCH, 5));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, 4500, "Fernando", "4036565899", "51265156156", endereco, Setor.MARKETING, Genero.MASCULINO, 10250, LocalDate.of(2000, Month.AUGUST, 5));
        
        
        System.out.println(diretor);
        System.out.println(motorista);
        System.out.println(advogado);
        System.out.println(gerente);
        
    
        
    }
    
    
}
