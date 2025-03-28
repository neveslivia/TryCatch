package Program;

import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um número inteiro positivo: ");
            int num = sc.nextInt();
            verificarNumero(num);
            System.out.printf("A raiz quadrada de %d é %.2f",num,Math.sqrt(num));

        }catch (IllegalArgumentException e){
            System.err.println("Erro: " + e.getMessage());

        }
        sc.close();



    }
    public static void verificarNumero( int num) throws IllegalArgumentException{
        if (num < 0){
            throw new IllegalArgumentException("Números negativos não são permitidos!");
        }
    }

}
