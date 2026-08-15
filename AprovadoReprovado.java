/*
 * Leia 3 notas de um aluno e imprima se ele foi aprovado ou não.
 * Obs: O aluno deve possuir média 7.0 ou maior para ser aprovado.
 */

import java.util.Scanner;

public class AprovadoReprovado {

public static void main (String[] args) {
    
    System.out.println("Digite suas 3 notas: ");
    
    Scanner scanner = new Scanner(System.in) ;
    
    double nota1 = scanner.nextDouble();
    double nota2 = scanner.nextDouble();
    double nota3 = scanner.nextDouble();

    double media = (nota1 + nota2 + nota3) / 3;

    if (media >= 7.0) {
        System.out.println("Parabéns! Você foi aprovado com média: " + media);
    } else {
        System.out.println("Você foi reprovado com média: " + media);
    }

scanner.close();


}
    
}
