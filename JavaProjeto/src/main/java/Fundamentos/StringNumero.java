package Fundamentos;
import javax.swing.JOptionPane;
import javax.swing.*;

public class StringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(
                "Digite o primeiro número");
        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo número");

        String s = "10";
        //parseFloat , parseInteger
        // Integer.toString , Double.ToString
        // Double.toString();
        int num1 = Integer.parseInt(s);
        System.out.println(valor1+valor2);
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1+numero2;
        System.out.println("Soma é " + soma);
        System.out.println("Media é " + soma / 2);
    }
}
