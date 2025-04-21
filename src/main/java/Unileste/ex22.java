package Unileste;
import java.util.Scanner;
public class ex22 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o valor da sua compra : ");
    double compra = sc.nextDouble();
    if(compra < 10){
        double valorDaCompra = 10*0.7;
        System.out.println("O valor da venda é de : " + valorDaCompra);
    }else if(compra <= 10 && compra < 30){
        double valorDaCompra = 10*0.5;
        System.out.println("O valor da venda é de : " + valorDaCompra);
    }else if(compra <= 30 && compra < 50){
        double valorDaCompra = 10*0.4;
        System.out.println("O valor da venda é de : " + valorDaCompra);
    } else if (compra >= 50) {
        double valorDaCompra = 10*0.3;
        System.out.println("O valor da venda é de : " + valorDaCompra);
    }
    sc.close();
    }
}
