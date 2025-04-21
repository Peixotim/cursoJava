package Atividades;
import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número a ser somado : ");
        Integer num1 = sc.nextInt();
        System.out.print("Digite o segundo número a ser somado : ");
        Integer num2 = sc.nextInt();
        Integer soma = num1 + num2;
        System.out.println("A soma dos dois números é de " + soma);
        sc.close();
    }
}
