package Unileste;
import java.util.Scanner;
public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para saber o dia correspondente com a semana : ");
        int diasDaSemana = sc.nextInt();
        if(diasDaSemana >= 1 && diasDaSemana <= 7){
            switch (diasDaSemana){
                case 1:
                    System.out.println("Segunda - feira");
                    break;
                case 2:
                System.out.println("Terça - feira");
                    break;
                case 3:
                    System.out.println("Quarta - feira");
                    break;

                case 4:
                    System.out.println("Quinta - feira");
                    break;

                case 5:
                    System.out.println("Sexta - feira");
                    break;

                case 6:
                    System.out.println("Sabado");
                    break;

                case 7:
                    System.out.println("Domingo");
                    break;
            }
        }else{
            System.out.println("Esse dia não existe na semana ! ");
        }
        sc.close();
    }
}
