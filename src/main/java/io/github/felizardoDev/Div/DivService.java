package io.github.felizardoDev.Div;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter

public class DivService {
    public double split(double dividend, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("It is impossible for the divisor to be 0");
        }
        return dividend / divisor;
    }
}
