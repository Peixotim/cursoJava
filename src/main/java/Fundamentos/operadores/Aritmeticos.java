package Fundamentos.operadores;
import java.util.Scanner;
public class Aritmeticos {
    public static void main(String[] args) {
        //Poderiamos ter usado JOption para receber os numeros
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número para somar : ");
        double n1 = sc.nextInt();
        System.out.print("Digite o segundo número para somar : ");
        double n2 = sc.nextInt();
        double Soma = n1+n2;
        System.out.println("O resultado é : " + Soma);

        System.out.print("Digite um número para se multiplicar : ");
        double mut = sc.nextDouble();
        double mut2 = mut*mut;
        System.out.println("O resultado é : " + mut2);

        System.out.print("Digite um número para se dividir : ");
        double div = sc.nextDouble();
        double div2 = div/div;
        System.out.println("O resultado é : " + div2);

        System.out.print("Digite um número para se verificar se tem resto dividindo por 2 : ");
        double mod = sc.nextDouble();
        double mod2 = mut%2;
        System.out.println("O resto é : " + mod2);
        sc.close();

        double teste = Double.parseDouble("2");
    }
}
