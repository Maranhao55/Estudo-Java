import java.util.Scanner;

// Leia um número e imprima se ele é par ou ímpar .
public class ParOuImpar {

public static void main(String[] args)  {
Scanner input = new Scanner (System.in) ;

System.out.println("Digite o número inteiro" );
int numero = input.nextInt();
if (numero % 2 == 0 )  
    System.out.println("O número " + numero + " é par.");
 else 
    System.out.println("O número " + numero + " é ímpar.");

input.close () ;
}

}