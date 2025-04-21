import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número : ");
        double num = sc.nextDouble();
        if(num % 2 == 1){
            System.out.println("Seu número é primo ! ");
        }else{
            System.out.println("Seu número é par ! ");
        }
    }
}
