import java.util.Scanner;

   @guilherme.rpinto

public class AutonomiaDoCarro {

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite os quilometros: ");
        double km = Double.parseDouble(leitor.nextLine());
        
        System.out.print("Digite a quantidade de litros: ");
        double litros = Double.parseDouble(leitor.nextLine());
        
        double resultado = km/litros;
        
        System.out.println("Está fazendo: " + resultado + "km/l");
        
    }
    
}
