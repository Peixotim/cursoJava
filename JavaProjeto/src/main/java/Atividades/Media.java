package Atividades;
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua primeira  : ");
        int nota1 = sc.nextInt();
        System.out.print("Digite a sua segunda nota : ");
        int nota2 = sc.nextInt();
        System.out.print("Digite a sua terceira nota : ");
        int nota3 = sc.nextInt();
        int mediaDasNotas = (nota1+nota2+nota3)/3;
        System.out.println("A media das suas notas é de : " + mediaDasNotas);
        if(mediaDasNotas >= 7){
            System.out.println("Parabens você passou ! ");
        }else{
            System.out.println("Você não passou ! ");
        }
        sc.close();
    }
}
