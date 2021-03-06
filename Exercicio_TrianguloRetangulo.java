import java.util.Scanner;

   @guilherme.rpinto

public class TrianguloRetangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o valor do cateto A: ");
        double cateto_a = Double.parseDouble(leitor.nextLine());
        
        System.out.print("Digite o valor do cateto B: ");
        double cateto_b = Double.parseDouble(leitor.nextLine());
        
        double aux = (Math.pow(cateto_a, 2)) + (Math.pow(cateto_b, 2));
        
        double hipotenusa = Math.sqrt(aux);
        
        System.out.println("Valor da hipotenusa: " + hipotenusa);
    }
}
