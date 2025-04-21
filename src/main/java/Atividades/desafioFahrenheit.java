package Fundamentos;
import java.util.Scanner;
public class desafioFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite o valor de Fahrenheit : ");
        double F = sc.nextDouble();
        final double C = (F-32)/1.8;
        System.out.println("O valor de fahrenheit em celcius é de : " + C);
    }
}
