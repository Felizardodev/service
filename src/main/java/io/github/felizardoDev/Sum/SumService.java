package io.github.felizardoDev.Sum;

import org.springframework.stereotype.Service;

@Service

public class SumService {
    public int sum (int num1, int num2) {
        return num1 + num2;
    }
}
