package Atividades;
import java.util.Scanner;
public class MaiorEntreTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número : ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número : ");
        double num2 = sc.nextDouble();
        System.out.print("Digite o terceiro número : ");
        double num3 = sc.nextDouble();
        if(num1 > num2 && num1 > num3){
            System.out.println("O número " + num1 + " é o maior numero ! ");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O número " + num2 + " é o maior numero ! ");
        }else if (num3 > num1 && num3 > num2){
            System.out.println("O número " + num3 + " é o maior numero ! ");
        }
    }
}
