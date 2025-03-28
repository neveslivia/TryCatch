package Exceptions;

import java.io.IOException;

public class DadosInvalidosException extends IOException{
    public DadosInvalidosException(String message) {
        super(message);
    }
}
