package Atividade2;
import java.util.Scanner;

public class Programa1009 {
    public static void main (String [] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();
        double salarioFixo = Double.parseDouble(leitor.nextLine());
        double totalVendas = Double.parseDouble(leitor.nextLine());
        double total = salarioFixo + 0.15 * totalVendas;
        System.out.printf("TOTAL = R$ %.2f\n", total);
        leitor.close();
    }
}
