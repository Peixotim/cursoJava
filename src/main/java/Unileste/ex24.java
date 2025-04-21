package Unileste;
import java.util.Scanner;
public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor : ");
        double v1 = sc.nextDouble();
        System.out.print("Digite o segundo valor : ");
        double v2 = sc.nextDouble();
        System.out.print("Digite o terceiro valor : ");
        double v3 = sc.nextDouble();
        if(v1+v2 > v3 && v2+v1 > v3 && v1+v3 > v2){
            System.out.print("É possivel formar-se um triângulo ! ");
            if(v1 == v2 && v2==v3 && v3 == v1){
                System.out.print("Este triangulo é Equilatero ! ");
            }else if(v1 != v2 && v1 != v3 && v3 != v2 && v3 != v1){
                System.out.print("Este triangulo é Escaleno ! ");
            }else if(v1 == v2 && v1 != v3 || v1 != v2 && v1 == v3 && v2 != v1 && v2 == v3 || v2 == v1 && v2 != v3 || v3 == v1 && v3 != v2 || v3 != v1 && v3 == v2){
                System.out.print("Este triangulo é  Isósceles ! ");
            }
        }else{
            System.out.println("Não é possivel se formar um triangulo ! ");
        }
        sc.close();
    }
}
