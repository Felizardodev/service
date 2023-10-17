package io.github.felizardoDev.Mult;

import org.springframework.stereotype.Service;

@Service
public class MultService {
    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }
}
