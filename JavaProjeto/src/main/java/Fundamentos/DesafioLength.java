package Fundamentos;
import java.util.Scanner;
public class DesafioLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a palavra que deseja contar as letras");
        String contador = sc.nextLine();
        System.out.println("O numero de letras que há na sua palavra é de " + contador.length());
        sc.close();
    }
}