package Program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        try {
            int num = 0;
            Integer.parseInt(sc.next());
            System.out.println(num);
        }
        catch (NumberFormatException e){
            System.out.println("Exceção na entrada do número!");
        }

    }

}
