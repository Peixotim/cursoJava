public class DesafioFor {
    public static void main(String[] args) {
        String[] chaveDeValores = {"#","##","###","####", "#####"};
        for(String valor : chaveDeValores){
            System.out.println(valor);
            valor += "#";
        }

        for(String v = "#"; !v.equals("######");v += "#"){
            System.out.println(v);
        }
        // Versão do Desafio
        // Não pode usar valor númerico para controlar o laço
    }
}
