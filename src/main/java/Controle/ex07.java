import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int total = 0;

        while (num >= 0) { // Como num vai começar em 0 ; o while sempre vai ser true
            System.out.print("Digite um numero inteiro (ou negativo para sair):  ");
            num = sc.nextInt();
            if (num >= 0) {
                total += num;
                System.out.println("Sua soma de números até agora é de " + total);
            }
        }
        sc.close();

    }
}
