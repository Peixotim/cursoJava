package Fundamentos;

public class ConversaoTipoPrimitivo {
    public static void main(String[] args) {
        double a = 1; // Transforma o 1 Inteiro em double
        System.out.println(a);
        float b = (float) 1.2416; // Conversão Explicita com (float) CAST
        System.out.println(b);
        int c = 4;
        byte d = (byte) c; //conversão explicita com (byte) CAST
        double e = 1.4444444;
        int f = (int) e;

        // Tentar o máximo fugir do cast!
    }
}
