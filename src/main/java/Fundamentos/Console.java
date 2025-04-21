package Fundamentos;
import java.util.Scanner;
public class Console  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Olá"); // Não quebra linha
        System.out.println("Oi"); // Quebra Linha
        System.out.printf("MegaSena: %d %d %d %d %d %d %n", 1,2,3,4,5,6);
        System.out.printf("Salário: %.1fn", 1234.5678);
        System.out.println("Digite seu nome!");

        System.out.print("Digite seu nome : ");
        String nome = sc.nextLine(); // Quebra Linha
        System.out.print("Digite seu sobrenome : ");
        String sobrenome = sc.nextLine(); // Quebra Linha
        System.out.print("Digite sua idade : ");
        int idade = sc.nextInt(); // Quebra Linha
        System.out.printf("Cadastro feito : %s , %s , %d ", nome,sobrenome,idade);
        sc.close();
    }
}
