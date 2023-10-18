package io.github.felizardoDev.Sum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")

public class SumController {

    @Autowired
    private SumService sumService;

    @GetMapping("/make-sum") //Indica que esse método será invocado em uma requisição GET (postman)
    @ResponseBody //O valor de retorno deste método deve ser diretamente escrito no corpo da resposta HTTP

    public Map<String, Object> soma2 (@RequestParam int num1, @RequestParam int num2) {
        //Método em si, com 2 parâmetros - Map: <Tipo da Chave, Tipo do valor >
        Map<String, Object> rtn = new LinkedHashMap<>();
        rtn.put("result", sumService.sum(num1, num2));
        return rtn; //LinkedHashMap é retornado como a resposta da requisição.
    }
}