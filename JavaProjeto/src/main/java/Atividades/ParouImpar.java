package Atividades;
import java.util.Scanner;
public class ParouImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número que deseja verificar : ");
        int num1 = sc.nextInt();
        int resultado = num1%2;
        if(resultado == 0){
            System.out.println("Seu número é par");
        }else{
            System.out.println("Seu número é impar");
        }
        sc.close();
    }
}
