package Fundamentos.operadores;

public class DesafiosAritmeticos {
    public static void main(String[] args) {

    // Primeira Equação

    double c = 3+2;
    double c01 = 6*c;
    double c02 = Math.pow(c01,2);
    double c03 = c02/(3*2);


    // Segunda Equação
    double c1 = (double) ( (1-5)*(2-7)) / 2;
    double c12 = Math.pow(10,2);


    //Terceira Equação
    double calc1 = (c03-c12);
    double calc2 = Math.pow(calc1,3);


    //Quarta Equação
    double calc3 = Math.pow(10,3);


    //Quinta Equação
    double calcFinal=calc2/calc3;

    System.out.println(calcFinal);
    }
}
