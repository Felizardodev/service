package io.github.felizardoDev.BMI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class BmiController {

    @PostMapping("/calculate-bmi")
    public ResponseEntity<String> calculateBMI(@RequestBody BmiService bmiService) {
        double Height = bmiService.getHeight();
        double Weight = bmiService.getWeight();

        // Calcular IMC
        double bmi = Weight / (Height * Height);

        // Interpretar o IMC
        String result;
        if (bmi < 18.5) {
            result = "Under weight";
        } else if (bmi < 24.9) {
            result = "Normal weight";
        } else if (bmi < 29.9) {
            result = "Overweight";
        } else if (bmi < 34.9) {
            result = "Grade I obesity";
        } else if (bmi < 39.9) {
            result = "Grade II obesity";
        } else {
            result = "Grade III obesity";
        }

        return ResponseEntity.ok("Your BMI is " + bmi + ". This is classified as: " + result);
    }
}