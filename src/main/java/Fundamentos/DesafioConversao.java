package Fundamentos;
import java.util.Scanner;
public class DesafioConversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu primeiro salario : ");
        String s1 = sc.nextLine(); // sc.nextLine().replace(",",".");
        System.out.print("Digite o seu segundo salario : ");
        String s2 = sc.nextLine(); // sc.nextLine().replace(",",".");
        System.out.print("Digite o seu terceiro salario : ");
        String s3 = sc.nextLine(); // sc.nextLine().replace(",",".");

        String s1M = s1.replace("," , ".");
        String s2M = s2.replace("," , ".");
        String s3M = s2.replace("," , ".");

        double salario1 = Double.parseDouble(s1M);
        double salario2 = Double.parseDouble(s2M);
        double salario3 = Double.parseDouble(s3M);
System.out.println(s3);
        double MediaSalarial = salario1+salario2+salario3/3;

        System.out.println("A media de seu salario é de : " + MediaSalarial);
        sc.close();
    }

}
