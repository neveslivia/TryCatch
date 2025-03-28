package Program;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        try {
            System.out.println("Digite um número: ");
            num = Integer.parseInt(sc.next());
            System.out.println(num);
        }
        catch (NumberFormatException e){
            System.out.println("Exceção na entrada do número!");
        }
        catch (InputMismatchException e){
            System.out.println("Insira um número!");
        }
        sc.close();

    }

}
