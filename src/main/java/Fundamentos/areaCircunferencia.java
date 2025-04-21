package Fundamentos;
import java.util.Scanner;
public class areaCircunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite o valor de raio : ");
        double raio = sc.nextDouble();
        final double PI = 3.14;
        final double areaCircunferencia = raio * PI * raio;
        System.out.println("Considere o valor de PI: " + PI);
        System.out.println(areaCircunferencia);
        sc.close();
    }
}
