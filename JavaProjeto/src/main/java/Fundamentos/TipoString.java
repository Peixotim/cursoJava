package Fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Ola.pessoal".charAt((2))); // Pega a letra de acordo com o indice chamado
        String s = "Bom Dia";
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("Bom"));
        System.out.println(s.endsWith("Dia"));
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.equals("Bom Dia"));
        System.out.println(s.equalsIgnoreCase("Bom Dia"));
        System.out.println(s.toLowerCase().equals("bom dia"));
        System.out.println(s.toUpperCase().equals("BOM DIA"));
        var nome = "Pedro";
        System.out.println(s.indexOf("Bom"));
        System.out.println(s.contains("Dia"));
        System.out.println(s.substring(2));
        System.out.println(s.substring(2 , 4));
    }
}
