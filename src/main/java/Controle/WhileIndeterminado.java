package Controle;
import java.util.Scanner;
public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Você diz : ");
        String dizer = sc.nextLine();

        while( ! dizer.equalsIgnoreCase("Fim") ){ // Enquanto dizer não for igual a fim continue o codigo while = enquanto
            System.out.print("Você diz : ");
            dizer = sc.nextLine();
        }
        sc.close();
    }
}
