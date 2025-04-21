package Classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto P1 = new Produto(); // Criando o objeto

        // Atribuindo valor ao objeto

        P1.nome = "Notebook";
        P1.preco = 4000.0;
        P1.desconto = 0.1;

        Produto P2 = new Produto();

        P2.nome = "Celular";
        P2.preco = 2.000;
        P2.desconto = 0.12;

        double P1ComDesconto;
        if(P1.preco == 4000){

            P1ComDesconto =  P1.precoComDesconto();
            System.out.println("O valor do produto com desconto é de : " + P1ComDesconto);
        }

        System.out.println();
    }
}
