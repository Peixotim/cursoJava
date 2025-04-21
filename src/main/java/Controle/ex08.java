import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 10;
        int num = 0;
        int maiorNum = 0;

        while(contador != 0){
            System.out.print("Digite um número : ");
            num = sc.nextInt();

            if(num > maiorNum){
                maiorNum = num;
            };
            contador --;
        }
        System.out.println(maiorNum);
    }
}
