/*
 * Imprimir a tabuada de um número.
 * 
 * 1. Ler um número
 * 2. Imprimir sua tabuada
 * 
 * 1 a 10 : 1 x 1 = 1, 1 x 2 = 2, ... 1 x 10 = 10.
 */

import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in) ; 

    System.out.println("Digite um número para gerar a Tabuada ");
    int numero = scanner.nextInt() ;

    System.out.println(numero + " x 1 = " +(1 * numero) );
    System.out.println(numero + " x 2 = " +(2 * numero) );
    System.out.println(numero + " x 3 = " +(3 * numero) );
    System.out.println(numero + " x 4 = " +(4 * numero) );
    System.out.println(numero + " x 5 = " +(5 * numero) );
    System.out.println(numero + " x 6 = " +(6 * numero) );
    System.out.println(numero + " x 7 = " +(7 * numero) );
    System.out.println(numero + " x 8 = " +(8 * numero) );
    System.out.println(numero + " x 9 = " +(9 * numero) );
    System.out.println(numero + " x 10 = " +(10 * numero) );
    System.out.println(numero + " x 11 =" + (11 * numero) ) ;
    scanner.close() ;

  }

}
