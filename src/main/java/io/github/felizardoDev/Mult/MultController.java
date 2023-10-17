package io.github.felizardoDev.Mult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")

public class MultController {

    @Autowired
    private MultService multService;

    @GetMapping("/make-multiplication/{num1}/{num2}") //no postman colocar o valor das var no path/ url
    @ResponseBody
    public double multiply (@PathVariable double num1, @PathVariable double num2) {
        return multService.multiplication(num1, num2);
    }
}
