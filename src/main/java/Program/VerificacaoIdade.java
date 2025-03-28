package Program;

import Exceptions.IdadeInvalidaException;

import java.util.Scanner;

public class VerificacaoIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite a sua idade: ");
            int idade = sc.nextInt();
            validarIdade( idade);

        }
        catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }finally {
            sc.close();
        }

    }
    public static void validarIdade( int idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException("A idade não pode ser negativa!");
        } else if (idade < 18) {
            System.out.println("Você é menor de idade!");

        }else{
            System.out.println("Você é maior de idade!");
        }

    }
}
