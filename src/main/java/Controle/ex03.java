import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua primeira nota : ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite sua segunda nota : ");
        double nota2 = sc.nextDouble();

        double media = (nota1+nota2) / 2 ;

        if(media >= 7){
            System.out.println("Aprovado ! ");
        }else if(media < 7 && media >= 4){
            System.out.println("Recuperação ! ");
        }else{
            System.out.println("Reprovado ! ");
        }
    }
}
