package io.github.felizardoDev.BMI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class BmiController {

    @GetMapping("/calculate-bmi")
    @ResponseBody
    public Map<String, Object> calculateBMI(@RequestParam double height, @RequestParam double weight) {

        // Calcular IMC
        double bmi = weight / (height * height);

        // Interpretar o IMC
        String result;
        if (bmi < 18.5) {
            result = "Underweight";
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

        Map<String, Object> response = new LinkedHashMap<>(); //LinkedHashMap =>  a ordem de inserção será preservada
        response.put("bmi", bmi);
        response.put("classification", result);

        return response;
    }
}