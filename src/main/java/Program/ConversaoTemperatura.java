package Program;

import Exceptions.TemperaturaInvalidaException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite a temperatura em Celsius: ");
            double temperaturaC = sc.nextDouble();
            verificarTemperatura(temperaturaC);
            double temperaturaF = (temperaturaC * 1.8) + 32;
            System.out.println("A temperatura em Fahrenheit: " + temperaturaF);

        }
        catch (TemperaturaInvalidaException e){
            System.out.println("Erro: " + e.getMessage());

        }
        catch (InputMismatchException e){
            System.out.println("Digite números!");
        }

    }
    public static void verificarTemperatura(double temperatura) throws TemperaturaInvalidaException {
        if (temperatura < (-273.15)){
        throw  new TemperaturaInvalidaException("A temperatura não pode ser menor que -273.15!");

        }


    }
}
