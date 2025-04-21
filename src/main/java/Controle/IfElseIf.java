import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota : ");
        double n1 = sc.nextDouble();
        if(n1 > 10 || n1 < 0){
            System.out.println("Nota invalida");
        }else if(n1 == 4){
            System.out.println("Conceito D");
        }else{
            System.out.println("Conceito E");
        }
        sc.close();
    }
}
