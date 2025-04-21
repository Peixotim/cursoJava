import java.util.Scanner;
import java.util.Random;
public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        int numGerado = gerador.nextInt(100);
        int num = 0 ;
        int tentativas = 10;

        while(tentativas > 0 ){
            System.out.print("Digite um número para acertar : ");
            num = sc.nextInt();
            if(num == numGerado){
                System.out.println("Parabéns , você acertou o numero gerado !");
                break;
            }else{
                System.out.println("Você não acertou o numero gerado :( ");
            }
            tentativas --;
        }

    }
}
