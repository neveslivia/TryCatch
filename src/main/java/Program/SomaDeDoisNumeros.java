package Program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SomaDeDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        double num1;
        double num2;
        try {
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            System.out.println(num1+num2);
        }
        catch (InputMismatchException e) {
            System.out.println("Digite números!");

        }
    }
}
