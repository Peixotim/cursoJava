package Fundamentos.operadores;
import java.util.Scanner;
public class Logicos {
    public static void main(String[] args) {
        boolean c1 = true;
        boolean c2 = 4 > 6;
        if(c1 && c2){
            System.out.println("Deu Bom ! ");
        }else{
            System.out.println("Deu Red ! ");
        }
        System.out.println(c1 && c2);
        System.out.println(c1 || c2);
        System.out.println(c1 ^ c2);
        System.out.println(!c1);
        System.out.println(!c2);

        //Tabela Verdade E
        System.out.println(true && true); // True
        System.out.println(false && true); //False
        System.out.println(true && false); //False
        System.out.println(false && false); //False

        //Tabela Verdade Ou
        System.out.println(true || true); // True
        System.out.println(false || true); //True
        System.out.println(true || false); //True
        System.out.println(false || false); //False

        //Tabela Verdade contrario
        System.out.println(!true); //False
        System.out.println(!false); //False
    }
}
