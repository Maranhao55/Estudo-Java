import java.util.Scanner;

/*
 * Imprimir preço de um produto com base no desconto à vista e o valor economizado.
 * 
 * 1. Ler preço
 * 2. Ler % de desconto
 * 3. Imprimir o preço com desconto e valor economizado em reais
 * 
 * Ex: R$100,00 com 10% de desconto = O preço com desconto é R$ 90,00 
 * e o valor economizado foi R$ 10,00
 */
public class PrecoComDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
    
        System.out.println("digite o preço" );
        double preço = scanner.nextDouble();
        System.out.println("digite o desconto em %:" );
        double desconto = scanner.nextDouble();

        double ValorEconomizado = ( preço * desconto) / 100 ;
        double preçoComDesconto = preço - ValorEconomizado ; 
        
        System.out.printf (" o preço com desconto é R$ %.2f e o valor economizado foi Rs %.2f " ,
        preçoComDesconto, ValorEconomizado 
        ) ;
        

         

         scanner.close(); 
    }
}
