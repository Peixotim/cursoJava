package Controle;

import java.util.Scanner;

public class desafioClientesDiarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Preciso saber qual a media de pessoas entra por semana na minha vendinha!

        int qdp = 0;
        int diaDasemana = 0;
        int qdpT = 0;

        while (diaDasemana != 7) {
            System.out.print("Quantas pessoas entraram hoje : ");
            qdp = sc.nextInt();

            if (qdp >= 0) {
                diaDasemana++;
                qdpT += qdp;
            } else {
                System.out.println("Este dia não foi validado ! ");
            }

        }
        int mediaSemanal = qdpT / diaDasemana;
        System.out.println("A média de pessoas por semana em sua vendinha é de : " + mediaSemanal);


    }
}


