package Fundamentos.operadores;
import java.util.Scanner;
public class Ternario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da sua media : ");
        double media = sc.nextDouble();
        String resultado = media >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}
