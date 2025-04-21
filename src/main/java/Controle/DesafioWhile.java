package Controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notaTotal = 0;
        double nota = 0;
        int alunosTotal = 0;

        while (nota != -1) {
            System.out.print("Digite uma nota: ");
            nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {

                notaTotal += nota;
                alunosTotal++;
            } else if (nota != -1) {
                System.out.println("Nota incorreta!");
            }

        }

        if (notaTotal >= 0 && alunosTotal >= 0) {
            double Media = notaTotal / alunosTotal;
            System.out.println("A media total turma é de : " + Media);
        } else {
            System.out.println("Não possui nota alguma ! ");
        }
        sc.close();
    }
}
