package io.github.felizardoDev.Sum;

import io.github.felizardoDev.Sum.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

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

    @GetMapping("/fazer-soma2")
    @ResponseBody
    public Map<String, Object> soma2 (@RequestParam int num1, @RequestParam int num2) {
    // Mapa: <Tipo da Chave, Tipo do valor > -> <> indica Generico
        Map<String, Object> rtn = new LinkedHashMap<>();
        rtn.put("result", sumService.sum(num1, num2));
        return rtn;
    }

    @GetMapping("/fazer-soma3")
    @ResponseBody
    public DataResponse<Integer> soma3 (@RequestParam int num1, @RequestParam int num2) {
        Integer resultado = sumService.sum(num1, num2);

        return DataResponse.<Integer>builder()
                .result(resultado)
                .build();
    }
}
