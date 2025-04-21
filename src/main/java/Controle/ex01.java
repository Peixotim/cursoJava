import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número : ");
        double num = sc.nextDouble();
        if(num >= 0 && num <= 10){
            System.out.println("Este número está entre 0 e 10");
        }else{
            System.out.println("Este número não está entre 0 e 10");
        }
    }
}
