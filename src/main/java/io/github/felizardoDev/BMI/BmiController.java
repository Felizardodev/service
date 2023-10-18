package io.github.felizardoDev.BMI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class BmiController {
    private BmiService bmiService;

    @Autowired //BmiService é injetado no construtor.

    public BmiController(BmiService bmiService) { //Construtor.
        this.bmiService = bmiService;
    }

    @GetMapping("/calculate-bmi")
    @ResponseBody
    public Map<String, Object> calculateBMI(@RequestParam double height, @RequestParam double weight) {
        //Método que aceita 2 parâmetros de requisição.

        return bmiService.calculateBMI(height, weight); //"Envia" a responsabilidade de calcular para a service.
    }
}
