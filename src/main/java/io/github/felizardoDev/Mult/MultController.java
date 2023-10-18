package io.github.felizardoDev.Mult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")

public class MultController {

    @Autowired
    private MultService multService;

    @GetMapping("/make-multiplication/{num1}/{num2}") //no postman colocar o valor das var no path/ url
    @ResponseBody
    public double multiply(@PathVariable double num1, @PathVariable double num2) {
        return multService.multiplication(num1, num2);
    }

    @GetMapping("/make-multiplication2") //no postman colocar a chave e valor no params, ex: api/make-division?dividend=25&divisor=0
    @ResponseBody
    public Map<String, Object> makeMultiplication(@RequestParam double num1, @RequestParam double num2) {
        Map<String, Object> result = new HashMap<>();

        double multiplicationResult = multService.multiplication(num1, num2);

        result.put("result", multiplicationResult);

        return result;
    }
}