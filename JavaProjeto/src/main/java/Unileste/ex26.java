package Unileste;
import java.util.Scanner;
public class ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a placa do seu carro : ");
        String placa = sc.nextLine();

        if (placa.length() == 7 && placa.charAt(6) == '1') {
            System.out.println("O IPVA do veiculo vence em Março ! ");
        }else if(placa.length() == 7 && placa.charAt(6) == '2'){
            System.out.println("O IPVA do veiculo vence em Abril ! ");
        }else if(placa.length() == 7 && placa.charAt(6) == '3'){
            System.out.println("O IPVA do veiculo vence em Maio ! ");
        }else if(placa.length() == 7 && placa.charAt(6) == '4'){
            System.out.println("O IPVA do veiculo vence em Junho ! ");
        } else if(placa.length() == 7 && placa.charAt(6) == '5'){
            System.out.println("O IPVA do veiculo vence em Julho ! ");
        }else if(placa.length() == 7 && placa.charAt(6) == '6'){
            System.out.println("O IPVA do veiculo vence em Agosto ! ");
        }else if(placa.length() == 7 && placa.charAt(6) == '7'){
            System.out.println("O IPVA do veiculo vence em Setembro ! ");
        }else if(placa.length() == 7 && placa.charAt(6) == '8'){
            System.out.println("O IPVA do veiculo vence em Outubro ! ");
        }else if(placa.length() == 7 && placa.charAt(6) == '9'){
            System.out.println("O IPVA do veiculo vence em Novembro ! ");
        }else if(placa.length() == 7 && placa.charAt(6) == '0'){
            System.out.println("O IPVA do veiculo vence em Dezembro ! ");
        }
    }
}
