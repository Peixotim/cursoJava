package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom Dia ! ";
        s = s.replace("!" ,"Pedro" );
        s = s.toUpperCase();
        s = s.concat("!!!");
        String teste = "Hello World".toUpperCase().replace("Hello","Ola");
        System.out.println(s);
        System.out.println(teste);
    }
}
