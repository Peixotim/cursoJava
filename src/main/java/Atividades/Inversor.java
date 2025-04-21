package Atividades;
import java.lang.StringBuilder;
import java.util.Scanner;
public class Inversor {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um texto para ser invertido : ");
    StringBuilder texto = new StringBuilder(sc.nextLine());
    System.out.println("O seu texto fica assim : " + texto.reverse());
    }
}
