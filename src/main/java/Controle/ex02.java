import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um ano : ");
        int ano = sc.nextInt();
        if(ano % 4 == 0){
            System.out.println("Seu ano é bissexto");
        }else{
            System.out.println("Seu ano não é bissexto");
        }
    }
}
