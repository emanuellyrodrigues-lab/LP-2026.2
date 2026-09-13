package Atividade2;
import java.util.Scanner;

public class Programa1006 {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        double A = Double.parseDouble(leitor.nextLine());
        double B = Double.parseDouble(leitor.nextLine());
        double C = Double.parseDouble(leitor.nextLine());
        double media2 = (2*A + 3*B + 5*C)/(2 + 3 + 5);
        System.out.printf("Media = %.1f\n", media2);
        leitor.close();
    }
}