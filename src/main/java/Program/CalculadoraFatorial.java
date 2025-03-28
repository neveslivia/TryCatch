package Program;

import Entities.FatorialRecursivo;
import Exceptions.LimiteFatorialExcedidoException;
import Exceptions.NumeroNegativoException;

import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite um número para calcular seu fatorial: ");
            int num = sc.nextInt();
            FatorialRecursivo fatorialRecursivo = new FatorialRecursivo();
            validarNumero(num);
            validarValorNumero(num);
            System.out.println("O fatorial do número é " + fatorialRecursivo.calcularFatorial(num));

        }
        catch (NumeroNegativoException e){
            System.out.println("Erro " + e.getMessage());

        } catch (LimiteFatorialExcedidoException e) {
            System.out.printf("Erro %s%n", e.getMessage());
        }
    }
    public static void validarNumero(int num) throws NumeroNegativoException{
        if (num < 0){
           throw new NumeroNegativoException("Números negativos não são permitidos!");
        }
    }
    public  static  void validarValorNumero (int num) throws LimiteFatorialExcedidoException{
        if (num > 20){
            throw  new LimiteFatorialExcedidoException("O número não pode ser maior que 20!");
        }
    }



}
