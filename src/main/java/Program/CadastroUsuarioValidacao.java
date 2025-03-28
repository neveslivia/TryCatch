package Program;

import Exceptions.DadosInvalidosException;

import java.util.Scanner;

public class CadastroUsuarioValidacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite o seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite a sua idade: ");
            int idade = sc.nextInt();
            validarDados(nome, idade);

        }
         catch (DadosInvalidosException e) {
        System.out.println("Erro: " + e.getMessage());
         } catch (Exception e) {
        System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
        sc.close();
        }

    }
    public static void validarDados(String nome, int idade) throws DadosInvalidosException {
        if (nome.isEmpty()) {
            throw new DadosInvalidosException("O nome não pode estar vazio.");
        }
        if (idade < 0) {
            throw new DadosInvalidosException("A idade não pode ser negativa.");
        }


    }
}
