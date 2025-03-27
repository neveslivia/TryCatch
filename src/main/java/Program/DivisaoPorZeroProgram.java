package Program;

import java.util.Scanner;

public class DivisaoPorZeroProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números inteiros: ");
        int num1;
        int num2;
        try {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("O resultado da divisão é " +num1/num2);

        }
        catch (ArithmeticException exception){
            System.out.println("Não é possível efetuar a divisão por zero!");

        }
        System.out.println("Final do programa!");
        sc.close();

    }
}
