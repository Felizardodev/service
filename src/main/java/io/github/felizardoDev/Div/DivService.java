package io.github.felizardoDev.Div;

import org.springframework.stereotype.Service;

@Service

public class DivService {
    public double divide(double dividend, double divisor) { //Método divide que aceita 2 parâmetros.
        if (divisor == 0) {
            throw new IllegalArgumentException("It is impossible for the divisor to be 0"); //Se o divisor for 0, a
            //exceção é enviada, indicando que a opreção não pode ser realizada.
        }
        return dividend / divisor;
    }
}
