package Fundamentos;
import java.util.Scanner;
public class Wrappers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Tipos primitivos transformados em classes
        Byte b = 1;
        Short s = 1000;
        Integer i = 10000;         // Integer.parseInt(sc.next());
        Long l = 100000000L;
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i*3);
        System.out.println(l/3);


        Float f = 123.0F;
        System.out.println(f);

        Double d = 1234.123;
        System.out.println(d);


        Boolean bo = Boolean.parseBoolean(("true"));
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c.toString());
        sc.close();
    }
}
