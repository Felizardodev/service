package io.github.felizardoDev.Sum;

import io.github.felizardoDev.Sum.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class SumController {

    @Autowired
    private SumService sumService;

    @GetMapping("/fazer-soma/{num1}/{num2}") //no postman colocar o valor das var no path/ url
    @ResponseBody
    public int soma (@PathVariable int num1, @PathVariable int num2) { //receber opr json, querystring
        return sumService.sum(num1, num2);
    }
}
