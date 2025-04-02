package Atividades;
import java.util.Scanner;
public class Multiplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número para se calcular a sua tabuada : ");
        int num1 = sc.nextInt();
        char x = 'X';
        for(int i = 1 ; i <= 10 ; i++){
            System.out.printf("%d x %d = %d %n", num1 ,i , num1 * i);
        }
        sc.close();
    }
}
