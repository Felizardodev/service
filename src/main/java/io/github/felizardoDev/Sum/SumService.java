package io.github.felizardoDev.Sum;

import org.springframework.stereotype.Service;

@Service //Marca classe como componente de serviço

public class SumService {
    public int sum (int num1, int num2) { //Método sum, lógica da operação.
        return num1 + num2;
    }
}
