package io.github.felizardoDev.Mult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")

public class MultController {

    @Autowired
    private MultService multService;

    @GetMapping("/make-multiplication") //no postman colocar a chave e valor no params,
    // ex: api/make-division?dividend=25&divisor=0
    @ResponseBody
    public Map<String, Object> makeMultiplication(@RequestParam double num1, @RequestParam double num2) {
        Map<String, Object> result = new LinkedHashMap<>();

        double multiplicationResult = multService.multiplication(num1, num2); //Calcula a mult usando o service.

        result.put("result", multiplicationResult);
        // Adiciona o resultado da multiplicação ao mapa result com a chave "result".

        return result;
    }
}