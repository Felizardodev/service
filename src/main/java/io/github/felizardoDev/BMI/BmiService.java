package io.github.felizardoDev.BMI;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class BmiService {
        public Map<String, Object> calculateBMI(double height, double weight) {
                //Método que calcula o IMC e retorna um map de chave(string) e valor (object)
                //ex no postman: /api/calculate-bmi?height=1.80&weight=80

                double bmi = weight / (height * height); //Lógica da conta.
                String result; //Resultado

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

                Map<String, Object> response = new LinkedHashMap<>();
                response.put("bmi", bmi);
                response.put("classification", result);

                return response;
        }
}

