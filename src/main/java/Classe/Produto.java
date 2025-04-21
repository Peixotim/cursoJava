package Classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    double precoComDesconto(){
         return preco * ( 1 - desconto); // Não é dividido por 100 pois já vai ser passado como divido já!
    };


}
