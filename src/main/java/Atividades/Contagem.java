package Atividades;
import java.util.Scanner;
public class Contagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 10 : ");
        int contador = sc.nextInt();
        while(contador <= 10){
            System.out.println("Contagem : " + contador);
            contador ++;
        }
        sc.close();
    }
}
