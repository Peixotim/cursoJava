package Controle;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dizer = "";

        do {
            System.out.print("Você diz : ");
            dizer = sc.nextLine();
        } while(! dizer.equalsIgnoreCase("Fim"));



        sc.close();
    }
}
