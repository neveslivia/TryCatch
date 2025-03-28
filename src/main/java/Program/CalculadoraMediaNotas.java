package Program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraMediaNotas {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        try{
            System.out.println("Digite três notas: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();
            double media = (num1 + num2 + num3) / 3;
            System.out.println("A média das notas é " + media);
        }
        catch (InputMismatchException e){
            System.out.println("Insira somente números!");
        }

    }



}
