import java.util.Scanner;

/*
 * Exercício 1: 
 * 
 * Dadas 3 notas, imprimir a média aritmética do aluno.
 * 
 * 1. Ler 3 notas
 * 2. Calcular média
 * 3. Imprimir resultado
 * 
 * Fórmula: MA = (n1 + n2 + n3) / 3
 * 
 * Dica: Para testar, informe os números decimais com vírgula ao invés de ponto: 
 * Ex: 7,0 7,0 7,0
 */
public class MediaAritmetica {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
  
    System.out.println("Digite as 3 notas do aluno:");

    double nota1 = scanner.nextDouble() ; 
    double nota2 = scanner.nextDouble() ; 
    double nota3 = scanner.nextDouble() ; 
    
    scanner.close () ;

    double mediaAritmetica = (nota1 + nota2 + nota3) / 3 ;
    System.out.printf ( " A Média obtida foi %.2f", mediaAritmetica) ; 
  }
}
