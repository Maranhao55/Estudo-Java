import java.io.Console;

public class EstruturaDeSelecaoSwitch {

    public static void main(String[] args) {
        // A,B,C,D ou F
        Console console = System.console();
        System.out.println("Informe a nota (A,B,C,D ou F): ");
        String nota = console.readLine();

        String mensagem;
        switch (nota) {
            case "A":
            case "a":
                mensagem = "Excelente";
                break;
            case "B":
            case "b":
                mensagem = "Muito bom";
                break;
            case "C":
            case "c":
                mensagem = "Bom";
                break;
            case "D":
            case "d":
                mensagem = "Regular";
                break;
            case "F":
            case "f":
                mensagem = "Insuficiente";
                break;
            default:
                mensagem = "Nota inválida";
                break;
        }
        System.out.println(mensagem);

    }
}

/*no modelo antigo da pra fazer assim tbm 
  
switch (nota) { 
         case "A": case "a": System.out.println("Excelente"); break;
         case "B":case "b": System.out.println("muito bom"); break;
         case "C": case "c": System.out.println("bom"); break;
         case "D": case "d": System.out.println("regular"); break;
         case "F": case "f": System.out.println("insuficiente"); break;
         default: System.out.println("Nota inválida"); break;
        } */

        /* no modelo novo é assim
        import java.util.Scanner;

public class EstruturaDeSelecaoSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota (A, B, C, D ou F): ");
        String nota = scanner.nextLine().trim().toUpperCase();

        String mensagem = switch (nota) {
            case "A" -> "Excelente";
            case "B" -> "muito bom";
            case "C" -> "bom";
            case "D" -> "regular";
            case "F" -> "insuficiente";
            default -> "Nota inválida";
        };

        System.out.println(mensagem);
    }
} */
