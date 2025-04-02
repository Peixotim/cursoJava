package Fundamentos.operadores;
import java.util.Scanner;
public class DesafioLogicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            // Equals serve para ser o ==
        System.out.print("O trabalho de terça deu certo  SIM OU NÃO : ");
        String TT = sc.nextLine();
        System.out.print("O trabalho de quinta deu certo  SIM OU NÃO : ");
        String TQ = sc.nextLine();

        if(TT.equals("Sim") && TQ.equals("Sim")){
            System.out.println("Televisão 50 polegadas comprada ! ");
            System.out.println("Tomamos sorvete !");
        }else if (TT.equals("Sim") || TQ.equals("Sim")){
            System.out.println("Televisão 32 polegadas comprada ! ");
            System.out.println("Tomamos sorvete !");
        }else{
            System.out.println("Não compramos televisão ! ");
            System.out.println("Ficamos mais saudaveis ! ");
        }
    sc.close();
    }
}
