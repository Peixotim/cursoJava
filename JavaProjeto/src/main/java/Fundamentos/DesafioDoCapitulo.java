package Fundamentos;
import java.util.Scanner;
public class DesafioDoCapitulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número : ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número : ");
        double n2 = sc.nextDouble();
        System.out.print("Digite o tipo da operação que você deseja : ");
        String op = sc.nextLine();
        System.out.printf("%f %n %f = ?" , n1,op,n2);
    }
}
