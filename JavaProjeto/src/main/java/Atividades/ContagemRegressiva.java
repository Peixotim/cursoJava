package Atividades;
import java.util.Scanner;
public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para contagem regressiva : ");
        int num = sc.nextInt();
        while (num >= 0){
            System.out.println("Contagem Regressiva : " + num);
            num--;
        }
        sc.close();
    }
}
