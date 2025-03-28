package Program;

import java.util.Scanner;

public class AcessoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int [] array ={1,2,3,4,5,6,7,8,9,};
            System.out.println("Digite o índice de um array: ");
            int indice = sc.nextInt();
            System.out.println(array[indice]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Índice inválido!");
        }


    }
}
