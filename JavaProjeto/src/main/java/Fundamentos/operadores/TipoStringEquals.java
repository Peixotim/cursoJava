package Fundamentos.operadores;

public class TipoStringEquals {
    public static void main(String[] args) {
        String n1 = "Pedro";
        String n2 = "Pedro";

        String n3 = "Pexp";
        String n4 = "Peixotim";
        System.out.println(n1.equals(n2));
        System.out.println(n3.equals(n4));
        // Objetivo da aula : Sempre quando for comprar String usar equals não ==
    }
}
