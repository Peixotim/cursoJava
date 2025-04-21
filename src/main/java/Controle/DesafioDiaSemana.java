import java.util.Objects;
import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um dia da semana : ");
        String dia = sc.nextLine();
        String dia2 = dia.toLowerCase();
        if(Objects.equals(dia2, "domingo")){
            System.out.println("1");
        }else if(Objects.equals(dia2, "segunda")){
            System.out.println("2");
        }else if(Objects.equals(dia2, "terça")|| Objects.equals(dia2, "terca")){
            System.out.println("3");
        }else if(Objects.equals(dia2, "quarta")){
            System.out.println("4");
        }else if(Objects.equals(dia2, "quinta")){
            System.out.println("5");
        }else if(Objects.equals(dia2, "sexta")){
            System.out.println("6");
        }else if(Objects.equals(dia2, "sábado") || Objects.equals(dia2, "sabado")){
            System.out.println("7");
        }
        sc.close();
    }
}
