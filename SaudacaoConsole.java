
import java.io.Console;

/*
 * Crie um programa que leia um nome e imprima uma saudação utilizando o 
 * Console ao invés do Scanner.
 * 
 * Javadoc: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/Console.html
 */
public class SaudacaoConsole {
  public static void main(String[] args) {
    Console console = System.console() ;

    System.out.println("Qual é o seu Nome ?");
    String nome = console.readLine() ;
    System.out.println("Olá, " + nome );

  }  
}