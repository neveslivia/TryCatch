package Program;

import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro ppositivo: ");
        int num = sc.nextInt();
        System.out.println(Math.sqrt(num));
    }
}
