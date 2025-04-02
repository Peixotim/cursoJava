package Unileste;
import java.util.Scanner;
public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua Idade : ");
        int idade = sc.nextInt();
        if(idade <= 10){
            System.out.print("Você deverá pagar R$ 80,00 ");
        }else if(idade >= 10 && idade <= 29){
            System.out.print("Você deverá pagar R$ 120,00 ");
        }else if(idade >= 29 && idade <= 45){
            System.out.print("Você deverá pagar R$ 180,00 ");
        }else if(idade >= 45 && idade <= 59){
            System.out.print("Você deverá pagar R$ 180,00 ");
        }else if(idade >= 29 && idade <= 45){
            System.out.print("Você deverá pagar R$ 280,00 ");
        }else if(idade >= 59 && idade <= 65){
            System.out.print("Você deverá pagar R$ 330,00 ");
        }else if(idade >= 65){
            System.out.print("Você deverá pagar R$ 400,00 ");
        }
        sc.close();
    }
}
