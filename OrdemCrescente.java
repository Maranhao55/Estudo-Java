import java.util.Scanner;
public class OrdemCrescente {
    // Leia 3 números e imprima-os em ordem crescente .
public static void main(String[] args) {
    Scanner scanner = new Scanner ( System.in) ;

System.out.println ("Digite os 3 números ") ;

int numero1 = scanner.nextInt() ;
int numero2 = scanner.nextInt();
int numero3 = scanner.nextInt();

int menor;
int meio;
int maior;

if (numero1 < numero2 && numero1 < numero3 ) {
 System.out.println(numero1);

if (numero2 < numero3 ) {
 System.out.println(numero2);
 System.out.println(numero3);
} else {
 System.out.println(numero3); 
 System.out.println(numero2);
}

} else if (numero2 <numero1 && numero2 < numero3) {
 System.out.println(numero2);

if (numero1 < numero3 ) {
System.out.println(numero1);
System.out.println(numero3);

} else {
 System.out.println(numero3);
 System.out.println(numero1);
}
} else {
    System.out.println(numero3);
    if(numero1 < numero2) {
        System.out.println(numero1);
        System.out.println(numero2);
    } else {
        System.out.println(numero2);
        System.out.println(numero1);
}

scanner.close(); 
}
}
}