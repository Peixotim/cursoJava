package Classe;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();

        int somar = calcular.soma(20,20);
        int subtrair = calcular.subtracao(20,20);
        int multiplicacao = calcular.multiplicacao(20,20);
        int divisao = calcular.divisao(20,20);

        System.out.println(somar);
        System.out.println(subtrair);
        System.out.println(multiplicacao);
        System.out.println(divisao);
    }
}
