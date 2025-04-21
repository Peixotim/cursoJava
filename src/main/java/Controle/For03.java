package Controle;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 0;
        for (; i < 10; i++) {
            for(; j < 10 ; j++){
                System.out.printf("[%d %d]", i , j);
            }
            System.out.println();
        }
    }
}
