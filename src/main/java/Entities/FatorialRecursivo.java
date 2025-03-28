package Entities;

public class FatorialRecursivo {
    public int calcularFatorial(int num)  {
        if (num >= 1){
            int resultado =  num * calcularFatorial(num -1);
            return resultado;
        }
        return  1;


    }
}
