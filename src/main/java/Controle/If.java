package Controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua media : ");
        double media = sc.nextDouble();
        if(media <= 10 && media >= 7){
            System.out.println("Parabéns você passou ! ");
        }else if(media < 7 && media >= 4.5){
            System.out.println("Recuperação ! ");
        }else{
            System.out.println("Reprovado ! ");
        }
        sc.close();
    }
}
